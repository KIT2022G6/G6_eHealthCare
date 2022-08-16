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
public class Department {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Id
	@Column(name = "departmentID", unique = true)
	private String depID;

	private String dName;
	private int dCharge;

	@Column(name = "dDescription")
	private String dDes;

	@OneToMany(mappedBy = "depID", cascade = CascadeType.ALL)
	private Set<Doctor> listDoctor;
}
