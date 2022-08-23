package edu.multicampus.eHealthCare.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.multicampus.eHealthCare.generator.CodeGenerator;
import lombok.Data;

@Entity
public class Department{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dep_seq") 
	@GenericGenerator(
	        name = "dep_seq", 
	        strategy = "edu.multicampus.eHealthCare.generator.CodeGenerator", 
	        parameters = {
	        	@Parameter(name = CodeGenerator.INCREMENT_PARAM, value = "50"),
	            @Parameter(name = CodeGenerator.VALUE_PREFIX_PARAMETER, value = "KK_"),
	            @Parameter(name = CodeGenerator.NUMBER_FORMAT_PARAMETER, value = "%04d") })
	private String depID;

	private String dName;
	private int dCharge;

	@Column(name = "dDescription")
	private String dDes;

	
	@OneToMany(mappedBy = "departmentID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Doctor> listDoctor;


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
