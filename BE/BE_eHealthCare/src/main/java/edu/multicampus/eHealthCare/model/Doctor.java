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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doctorID", unique = true)
	private Long docID;

	@Column(nullable = false)
	private String dName, dPhone, dEmail;
	@Column(columnDefinition = "INT(3) UNSIGNED")
	private int dAge;

	@ManyToOne
	@JoinColumn(name = "deppartmentID")
	private Department depID;

	@ManyToOne
	@JoinColumn(name = "scheduleID")
	private Schedule schID;

	@OneToMany(mappedBy = "docID", cascade = CascadeType.ALL)
	private Set<Paper> listPaper;
}
