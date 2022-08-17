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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInsID() {
		return insID;
	}

	public void setInsID(String insID) {
		this.insID = insID;
	}

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public String getiDes() {
		return iDes;
	}

	public void setiDes(String iDes) {
		this.iDes = iDes;
	}

	public Set<Patient> getListPatient() {
		return listPatient;
	}

	public void setListPatient(Set<Patient> listPatient) {
		this.listPatient = listPatient;
	}

	public Insurance(String insID, String iName, String iDes, Set<Patient> listPatient) {
		this.insID = insID;
		this.iName = iName;
		this.iDes = iDes;
		this.listPatient = listPatient;
	}

	public Insurance() {
	}
}
