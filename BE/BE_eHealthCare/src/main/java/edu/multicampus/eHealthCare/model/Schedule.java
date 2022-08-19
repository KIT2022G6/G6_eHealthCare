package edu.multicampus.eHealthCare.model;


import com.fasterxml.jackson.annotation.JsonIgnore;


import java.io.Serializable;

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

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Schedule implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "scheduleID", unique = true)
	private String scheduleID;


	private Date date;

	private Date schDate;

	public Date getSchDate() {
		return schDate;
	}

	public void setSchDate(Date schDate) {
		this.schDate = schDate;
	}


	private String schShift;

	@JsonBackReference
	@Fetch(FetchMode.JOIN)
	@OneToMany(mappedBy = "scheduleID", cascade = CascadeType.ALL)
	private Set<Doctor> listDoctor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
		this.id = id;
		this.scheduleID = scheduleID;
		this.schDate = schDate;
		this.schShift = schShift;
		this.listDoctor = listDoctor;
	}


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