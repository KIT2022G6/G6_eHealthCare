package edu.multicampus.eHealthCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long precriptionID;
	private int preAmount, preDosage;
	private String preTime;

	@OneToMany(mappedBy = "recordID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<MedicalRecord> listRecord;

	@OneToMany(mappedBy = "precriptionID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<MedInvoice> listMedInvoice;

	public Prescription() {
		super();
	}

	public Prescription(int preAmount, int preDosage, String preTime, Set<MedicalRecord> listRecord,
			Set<MedInvoice> listMedInvoice) {
		super();
		this.preAmount = preAmount;
		this.preDosage = preDosage;
		this.preTime = preTime;
		this.listRecord = listRecord;
		this.listMedInvoice = listMedInvoice;
	}

	public Long getPrecriptionID() {
		return precriptionID;
	}

	public void setPrecriptionID(Long precriptionID) {
		this.precriptionID = precriptionID;
	}

	public int getPreAmount() {
		return preAmount;
	}

	public void setPreAmount(int preAmount) {
		this.preAmount = preAmount;
	}

	public int getPreDosage() {
		return preDosage;
	}

	public void setPreDosage(int preDosage) {
		this.preDosage = preDosage;
	}

	public String getPreTime() {
		return preTime;
	}

	public void setPreTime(String preTime) {
		this.preTime = preTime;
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
