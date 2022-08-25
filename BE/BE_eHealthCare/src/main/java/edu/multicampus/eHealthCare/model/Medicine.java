package edu.multicampus.eHealthCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@ToString
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long medicineID;

	private String medName;

	private Date medExp;
	private int medStorage, medPrice;

	@OneToMany(mappedBy = "medicineID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<MedInvoice> listMedInvoice;

	public Medicine() {
		super();
	}

	public Medicine(String medName, Date medExp, int medStorage, int medPrice, Set<MedInvoice> listMedInvoice) {
		super();
		this.medName = medName;
		this.medExp = medExp;
		this.medStorage = medStorage;
		this.medPrice = medPrice;
		this.listMedInvoice = listMedInvoice;
	}

	public Long getMedicineID() {
		return medicineID;
	}

	public void setMedicineID(Long medicineID) {
		this.medicineID = medicineID;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public Date getMedExp() {
		return medExp;
	}

	public void setMedExp(Date medExp) {
		this.medExp = medExp;
	}

	public int getMedStorage() {
		return medStorage;
	}

	public void setMedStorage(int medStorage) {
		this.medStorage = medStorage;
	}

	public int getMedPrice() {
		return medPrice;
	}

	public void setMedPrice(int medPrice) {
		this.medPrice = medPrice;
	}

	public Set<MedInvoice> getListMedInvoice() {
		return listMedInvoice;
	}

	public void setListMedInvoice(Set<MedInvoice> listMedInvoice) {
		this.listMedInvoice = listMedInvoice;
	}

}
