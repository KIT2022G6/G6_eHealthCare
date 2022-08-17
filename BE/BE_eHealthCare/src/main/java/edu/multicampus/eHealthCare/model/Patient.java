package edu.multicampus.eHealthCare.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.ToString;

@Entity
@ToString
public class Patient {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Id
	@Column(name = "patientID", unique = true)
	private String patientID;

	@Column(nullable = false)
	private String paUsername, paPassword, paFullName, paAddress, paPhone, paBloodtype;

	@Column(nullable = false)
	private Date paDob;

	@Column(nullable = false)
	private boolean paGender, paRhesus;

	@Column(columnDefinition = "INT(3) UNSIGNED ")
	private int paWeight, paHeight, paHeartrate;

	@ManyToOne
	@JoinColumn(name = "insuranceID")
	private Insurance insID;

	public Patient() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getPaUsername() {
		return paUsername;
	}

	public void setPaUsername(String paUsername) {
		this.paUsername = paUsername;
	}

	public String getPaPassword() {
		return paPassword;
	}

	public void setPaPassword(String paPassword) {
		this.paPassword = paPassword;
	}

	public String getPaFullName() {
		return paFullName;
	}

	public void setPaFullName(String paFullName) {
		this.paFullName = paFullName;
	}

	public String getPaAddress() {
		return paAddress;
	}

	public void setPaAddress(String paAddress) {
		this.paAddress = paAddress;
	}

	public String getPaPhone() {
		return paPhone;
	}

	public void setPaPhone(String paPhone) {
		this.paPhone = paPhone;
	}

	public String getPaBloodtype() {
		return paBloodtype;
	}

	public void setPaBloodtype(String paBloodtype) {
		this.paBloodtype = paBloodtype;
	}

	public Date getPaDob() {
		return paDob;
	}

	public void setPaDob(Date paDob) {
		this.paDob = paDob;
	}

	public boolean isPaGender() {
		return paGender;
	}

	public void setPaGender(boolean paGender) {
		this.paGender = paGender;
	}

	public boolean isPaRhesus() {
		return paRhesus;
	}

	public void setPaRhesus(boolean paRhesus) {
		this.paRhesus = paRhesus;
	}

	public int getPaWeight() {
		return paWeight;
	}

	public void setPaWeight(int paWeight) {
		this.paWeight = paWeight;
	}

	public int getPaHeight() {
		return paHeight;
	}

	public void setPaHeight(int paHeight) {
		this.paHeight = paHeight;
	}

	public int getPaHeartrate() {
		return paHeartrate;
	}

	public void setPaHeartrate(int paHeartrate) {
		this.paHeartrate = paHeartrate;
	}

	public Insurance getInsID() {
		return insID;
	}

	public void setInsID(Insurance insID) {
		this.insID = insID;
	}

	public Patient(String patientID, String paUsername, String paPassword, String paFullName, String paAddress, String paPhone, String paBloodtype, Date paDob, boolean paGender, boolean paRhesus, int paWeight, int paHeight, int paHeartrate, Insurance insID) {
		this.patientID = patientID;
		this.paUsername = paUsername;
		this.paPassword = paPassword;
		this.paFullName = paFullName;
		this.paAddress = paAddress;
		this.paPhone = paPhone;
		this.paBloodtype = paBloodtype;
		this.paDob = paDob;
		this.paGender = paGender;
		this.paRhesus = paRhesus;
		this.paWeight = paWeight;
		this.paHeight = paHeight;
		this.paHeartrate = paHeartrate;
		this.insID = insID;
	}
}
