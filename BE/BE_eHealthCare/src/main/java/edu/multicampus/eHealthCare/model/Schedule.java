package edu.multicampus.eHealthCare.model;


import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Schedule{
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long scheduleID;

//    @Id
//    @GeneratedValue(generator = "my_generator")  
//    @GenericGenerator(name = "my_generator", strategy = "edu.multicampus.eHealthCare.generator.MyGenerator")
//    @Column(name = "scheduleID")
//    private String scheduleID;

    private Date scheduleDate;
    private String scheduleShift;

    @OneToMany(mappedBy = "scheduleID", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Doctor> listDoctor;


  
    public Set<Doctor> getListDoctor() {
        return listDoctor;
    }

    public void setListDoctor(Set<Doctor> listDoctor) {
        this.listDoctor = listDoctor;
    }

    public Schedule() {
        super();
    }

	public Schedule(Date scheduleDate, String scheduleShift, Set<Doctor> listDoctor) {
		super();
		this.scheduleDate = scheduleDate;
		this.scheduleShift = scheduleShift;
		this.listDoctor = listDoctor;
	}

	public Long getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(Long scheduleID) {
		this.scheduleID = scheduleID;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getScheduleShift() {
		return scheduleShift;
	}

	public void setScheduleShift(String scheduleShift) {
		this.scheduleShift = scheduleShift;
	}

}