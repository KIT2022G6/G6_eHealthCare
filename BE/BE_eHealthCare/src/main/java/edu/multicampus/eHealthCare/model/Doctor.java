package edu.multicampus.eHealthCare.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Doctor {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "doctorID", unique = true)
	private String doctorID;

	@Column(nullable = false)
	private String dName, dPhone, dEmail, dUsername, dPassword;
	@Column(columnDefinition = "INT(3) UNSIGNED")
	private int dAge;
	
	@ManyToOne
	@JoinColumn(name = "departmentID")
	private Department depID;

	@ManyToOne
	@JoinColumn(name = "scheduleID")
	private Schedule schID;

	@OneToMany(mappedBy = "docID", cascade = CascadeType.ALL)
	private Set<Appointment> listPaper;
}
