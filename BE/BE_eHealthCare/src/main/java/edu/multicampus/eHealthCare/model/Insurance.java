package edu.multicampus.eHealthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;

@Entity
@ToString
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long insuranceID;

	private String insName;

	private String insDes;

	@OneToMany(mappedBy = "insuranceID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Patient> listPatient;

	public Long getId() {
		return insuranceID;
	}

	public void setId(Long id) {
		this.insuranceID = id;
	}

	

	

	public Long getInsuranceID() {
		return insuranceID;
	}

	public void setInsuranceID(Long insuranceID) {
		this.insuranceID = insuranceID;
	}

	public String getInsName() {
		return insName;
	}

	public void setInsName(String insName) {
		this.insName = insName;
	}

	public String getInsDes() {
		return insDes;
	}

	public void setInsDes(String insDes) {
		this.insDes = insDes;
	}

	public Set<Patient> getListPatient() {
		return listPatient;
	}

	public void setListPatient(Set<Patient> listPatient) {
		this.listPatient = listPatient;
	}

	

	public Insurance(String insName, String insDes, Set<Patient> listPatient) {
		super();
		this.insName = insName;
		this.insDes = insDes;
		this.listPatient = listPatient;
	}

	public Insurance() {
	}
}
