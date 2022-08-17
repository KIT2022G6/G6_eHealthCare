package edu.multicampus.eHealthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepID() {
		return depID;
	}

	public void setDepID(String depID) {
		this.depID = depID;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getdCharge() {
		return dCharge;
	}

	public void setdCharge(int dCharge) {
		this.dCharge = dCharge;
	}

	public String getdDes() {
		return dDes;
	}

	public void setdDes(String dDes) {
		this.dDes = dDes;
	}

	public Set<Doctor> getListDoctor() {
		return listDoctor;
	}

	public void setListDoctor(Set<Doctor> listDoctor) {
		this.listDoctor = listDoctor;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String depID, String dName, int dCharge, String dDes, Set<Doctor> listDoctor) {
		super();
		this.depID = depID;
		this.dName = dName;
		this.dCharge = dCharge;
		this.dDes = dDes;
		this.listDoctor = listDoctor;
	}

	public Department(String depID, String dName, int dCharge, String dDes) {
		super();
		this.depID = depID;
		this.dName = dName;
		this.dCharge = dCharge;
		this.dDes = dDes;
	}

}
