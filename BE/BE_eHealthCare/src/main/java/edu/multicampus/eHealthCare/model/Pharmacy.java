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
public class Pharmacy {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "pharmacyID", unique = true)
	private String pharmacyID;
	
	@Column(nullable = false)
	private String phUsername, phPassword;
	
	@Column(name = "phName")
	private String phName;

	@Column(name = "phDescription")
	private String phDes;

	@OneToMany(mappedBy = "pharmacyID", cascade = CascadeType.ALL)
	private Set<TotalInvoice> listTotalInvoice;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPharmacyID() {
		return pharmacyID;
	}

	public void setPharmacyID(String pharmacyID) {
		this.pharmacyID = pharmacyID;
	}

	public String getPhUsername() {
		return phUsername;
	}

	public void setPhUsername(String phUsername) {
		this.phUsername = phUsername;
	}

	public String getPhPassword() {
		return phPassword;
	}

	public void setPhPassword(String phPassword) {
		this.phPassword = phPassword;
	}

	public String getPhName() {
		return phName;
	}

	public void setPhName(String phName) {
		this.phName = phName;
	}

	public String getPhDes() {
		return phDes;
	}

	public void setPhDes(String phDes) {
		this.phDes = phDes;
	}

	public Set<TotalInvoice> getListTotalInvoice() {
		return listTotalInvoice;
	}

	public void setListTotalInvoice(Set<TotalInvoice> listTotalInvoice) {
		this.listTotalInvoice = listTotalInvoice;
	}

	public Pharmacy() {
	}

	public Pharmacy(String pharmacyID, String phUsername, String phPassword, String phName, String phDes, Set<TotalInvoice> listTotalInvoice) {
		this.pharmacyID = pharmacyID;
		this.phUsername = phUsername;
		this.phPassword = phPassword;
		this.phName = phName;
		this.phDes = phDes;
		this.listTotalInvoice = listTotalInvoice;
	}
}
