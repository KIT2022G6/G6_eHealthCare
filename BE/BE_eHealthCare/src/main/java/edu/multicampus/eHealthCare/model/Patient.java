package edu.multicampus.eHealthCare.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
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
}
