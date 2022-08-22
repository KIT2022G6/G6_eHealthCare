package edu.multicampus.eHealthCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Prescription {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Id
	@Column(name = "prescriptionID", unique = true)
	private String precriptionID;

	private int pAmo, pDos;
	private String pDet;

    @OneToMany(mappedBy = "recordID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<MedicalRecord> listRecord;
    
	@OneToMany(mappedBy = "precriptionID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<MedInvoice> listMedInvoice;

	public Prescription(Long id, String precriptionID, int pAmo, int pDos, String pDet, Set<MedicalRecord> listRecord,
			Set<MedInvoice> listMedInvoice) {
		super();
		this.id = id;
		this.precriptionID = precriptionID;
		this.pAmo = pAmo;
		this.pDos = pDos;
		this.pDet = pDet;
		this.listRecord = listRecord;
		this.listMedInvoice = listMedInvoice;
	}

	public Prescription() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrecriptionID() {
		return precriptionID;
	}

	public void setPrecriptionID(String precriptionID) {
		this.precriptionID = precriptionID;
	}

	public int getpAmo() {
		return pAmo;
	}

	public void setpAmo(int pAmo) {
		this.pAmo = pAmo;
	}

	public int getpDos() {
		return pDos;
	}

	public void setpDos(int pDos) {
		this.pDos = pDos;
	}

	public String getpDet() {
		return pDet;
	}

	public void setpDet(String pDet) {
		this.pDet = pDet;
	}

	public Set<MedicalRecord> getListRecord() {
		return listRecord;
	}

	public void setListRecord(Set<MedicalRecord> listRecord) {
		this.listRecord = listRecord;
	}

	public Set<MedInvoice> getListMedInvoice() {
		return listMedInvoice;
	}

	public void setListMedInvoice(Set<MedInvoice> listMedInvoice) {
		this.listMedInvoice = listMedInvoice;
	}

	
}
