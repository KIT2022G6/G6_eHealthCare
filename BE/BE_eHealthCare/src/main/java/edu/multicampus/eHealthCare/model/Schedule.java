package edu.multicampus.eHealthCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Schedule {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "scheduleID", unique = true)
	private String schID;

	private Date date;

	private String sShi;

	@OneToMany(mappedBy = "schID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Doctor> listDoctor;

	@ManyToOne
	@JoinColumn(name = "fk_doctorID")
	private Doctor doctorID;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSchID() {
		return schID;
	}

	public void setSchID(String schID) {
		this.schID = schID;
	}



	public String getsShi() {
		return sShi;
	}

	public void setsShi(String sShi) {
		this.sShi = sShi;
	}

	public Set<Doctor> getListDoctor() {
		return listDoctor;
	}

	public void setListDoctor(Set<Doctor> listDoctor) {
		this.listDoctor = listDoctor;
	}

	public Doctor getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(Doctor doctorID) {
		this.doctorID = doctorID;
	}

	public Schedule() {
		super();
	}

	public Schedule(String schID, Date sWor, String sShi, Set<Doctor> listDoctor, Doctor doctorID) {
		super();
		this.schID = schID;
		this.sShi = sShi;
		this.listDoctor = listDoctor;
		this.doctorID = doctorID;
	}

}