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
public class Insurance {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "insuranceID", unique = true)
	private String insID;

	@Column(name = "iName")
	private String iName;

	@Column(name = "iDescription")
	private String iDes;

	@OneToMany(mappedBy = "insID", cascade = CascadeType.ALL)
	private Set<Patient> listPatient;
}
