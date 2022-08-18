package edu.multicampus.eHealthCare.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Department implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "departmentID", unique = true)
	private String depID;

	private String dName;
	private int dCharge;

	@Column(name = "dDescription")
	private String dDes;

	@JsonBackReference
	@Fetch(FetchMode.JOIN)
	@OneToMany(mappedBy = "departmentID", cascade = CascadeType.ALL)
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
