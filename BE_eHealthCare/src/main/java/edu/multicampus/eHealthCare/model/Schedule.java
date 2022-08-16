package edu.multicampus.eHealthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "scheduleID", unique = true)
	private String schID;
	
	@Column(name = "sWorkingDate")
	private String sDate;
	private String sShift;
	
	@OneToMany(mappedBy = "schID", cascade = CascadeType.ALL)
	private Set<Doctor> listDoctor;
}
