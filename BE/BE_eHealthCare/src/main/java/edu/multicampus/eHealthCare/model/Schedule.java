package edu.multicampus.eHealthCare.model;


import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Schedule implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @GeneratedValue(generator = "my_generator")  
    @GenericGenerator(name = "my_generator", strategy = "edu.multicampus.eHealthCare.generator.MyGenerator")
    @Column(name = "scheduleID")
    private String scheduleID;

    private Date schDate;

    public Date getSchDate() {
        return schDate;
    }

    public void setSchDate(Date schDate) {
        this.schDate = schDate;
    }

    private String schShift;

    @OneToMany(mappedBy = "scheduleID", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Doctor> listDoctor;


    public String getSchID() {
        return scheduleID;
    }

    public void setSchID(String schID) {
        this.scheduleID = schID;
    }

    public String getSchShift() {
        return schShift;
    }

    public void setSchShift(String schShift) {
        this.schShift = schShift;
    }

    public Set<Doctor> getListDoctor() {
        return listDoctor;
    }

    public void setListDoctor(Set<Doctor> listDoctor) {
        this.listDoctor = listDoctor;
    }

    public Schedule() {
        super();
    }

    public Schedule(Date schDate, String schShift, Set<Doctor> listDoctor) {
        super();
        this.schDate = schDate;
        this.schShift = schShift;
        this.listDoctor = listDoctor;
    }

    public Schedule(Long id, String scheduleID, Date schDate, String schShift, Set<Doctor> listDoctor) {
        super();
        this.scheduleID = scheduleID;
        this.schDate = schDate;
        this.schShift = schShift;
        this.listDoctor = listDoctor;
    }

}