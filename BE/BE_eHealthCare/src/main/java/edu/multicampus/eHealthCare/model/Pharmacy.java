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
public class Pharmacy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pharmacyID;

	private String pharName;

	private String pharDescription;

	@OneToMany(mappedBy = "pharmacyID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<TotalInvoice> listTotalInvoice;

	public Pharmacy() {
		super();
	}

	public Pharmacy(String pharName, String pharDescription, Set<TotalInvoice> listTotalInvoice) {
		super();
		this.pharName = pharName;
		this.pharDescription = pharDescription;
		this.listTotalInvoice = listTotalInvoice;
	}

	public Long getPharmacyID() {
		return pharmacyID;
	}

	public void setPharmacyID(Long pharmacyID) {
		this.pharmacyID = pharmacyID;
	}

	public String getPharName() {
		return pharName;
	}

	public void setPharName(String pharName) {
		this.pharName = pharName;
	}

	public String getPharDescription() {
		return pharDescription;
	}

	public void setPharDescription(String pharDescription) {
		this.pharDescription = pharDescription;
	}

	public Set<TotalInvoice> getListTotalInvoice() {
		return listTotalInvoice;
	}

	public void setListTotalInvoice(Set<TotalInvoice> listTotalInvoice) {
		this.listTotalInvoice = listTotalInvoice;
	}

}
