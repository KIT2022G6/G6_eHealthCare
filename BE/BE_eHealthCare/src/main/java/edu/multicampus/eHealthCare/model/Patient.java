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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientID;

	@Column(nullable = false)
	private String paFullName, paAddress, paPhone, paBloodtype;

	@Column(nullable = false)
	private Date paDob;

	@Column(nullable = false)
	private boolean paGender, paRhesus;

	@Column(columnDefinition = "INT(3) UNSIGNED ")
	private int paWeight, paHeight, paHeartrate;

	@ManyToOne
	@JoinColumn(name = "fk_insuranceID")
	private Insurance insuranceID;

	public Patient() {
	}

	public Long getId() {
		return patientID;
	}

	public void setId(Long id) {
		this.patientID = id;
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
		return insuranceID;
	}

	public void setInsID(Insurance insID) {
		this.insuranceID = insID;
	}

	public Patient(String paFullName, String paAddress, String paPhone, String paBloodtype, Date paDob,
			boolean paGender, boolean paRhesus, int paWeight, int paHeight, int paHeartrate, Insurance insID) {
		super();
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
		this.insuranceID = insID;
	}

}
