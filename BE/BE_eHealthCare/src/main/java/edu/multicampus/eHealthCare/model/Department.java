package edu.multicampus.eHealthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departmentID;
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dep_seq") 
//	@GenericGenerator(
//	        name = "dep_seq", 
//	        strategy = "edu.multicampus.eHealthCare.generator.CodeGenerator", 
//	        parameters = {
//	        	@Parameter(name = CodeGenerator.INCREMENT_PARAM, value = "50"),
//	            @Parameter(name = CodeGenerator.VALUE_PREFIX_PARAMETER, value = "KK_"),
//	            @Parameter(name = CodeGenerator.NUMBER_FORMAT_PARAMETER, value = "%04d") })
//	private String depID;

	private String depName;
	private int depCharge;
	private String depDescription;

	@OneToMany(mappedBy = "departmentID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Doctor> listDoctor;

	public Department(String departmentName, int departmentCharge, String departmentDes, Set<Doctor> listDoctor) {
		super();
		this.depName = departmentName;
		this.depCharge = departmentCharge;
		this.depDescription = departmentDes;
		this.listDoctor = listDoctor;
	}

	public Long getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Long departmentID) {
		this.departmentID = departmentID;
	}


	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public int getDepCharge() {
		return depCharge;
	}

	public void setDepCharge(int depCharge) {
		this.depCharge = depCharge;
	}

	public String getDepDescription() {
		return depDescription;
	}

	public void setDepDescription(String depDescription) {
		this.depDescription = depDescription;
	}

	public Set<Doctor> getListDoctor() {
		return listDoctor;
	}

	public void setListDoctor(Set<Doctor> listDoctor) {
		this.listDoctor = listDoctor;
	}
}
