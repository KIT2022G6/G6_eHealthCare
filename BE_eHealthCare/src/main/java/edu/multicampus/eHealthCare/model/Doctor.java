package edu.multicampus.eHealthCare.model;

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
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "doctorID", unique = true)
	private String docID;

	@Column(nullable = false)
	private String dName, dPhone;
	@Column(columnDefinition = "UNSIGNED INT")
	private int dAge;
	@ManyToOne
	@JoinColumn(name = "deppartmentID")
	private Department depID;
	
	@ManyToOne
	@JoinColumn(name = "scheduleID")
	private Schedule schID;
}
