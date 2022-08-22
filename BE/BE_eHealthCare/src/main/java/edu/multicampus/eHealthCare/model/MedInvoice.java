package edu.multicampus.eHealthCare.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
public class MedInvoice {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "medInvoiceID", nullable = false)
	private String medInvoiceID;

	@ManyToOne
	@JoinColumn(name = "precriptionID")
	private Prescription precriptionID;

	@ManyToOne
	@JoinColumn(name = "medicineID")
	private Medicine medicineID;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedInvoiceID() {
		return medInvoiceID;
	}

	public void setMedInvoiceID(String medInvoiceID) {
		this.medInvoiceID = medInvoiceID;
	}

	public Prescription getPrecriptionID() {
		return precriptionID;
	}

	public void setPrecriptionID(Prescription precriptionID) {
		this.precriptionID = precriptionID;
	}

	public Medicine getMedicineID() {
		return medicineID;
	}

	public void setMedicineID(Medicine medicineID) {
		this.medicineID = medicineID;
	}

	public MedInvoice() {
	}

	public MedInvoice(String medInvoiceID, Prescription precriptionID, Medicine medicineID) {
		this.medInvoiceID = medInvoiceID;
		this.precriptionID = precriptionID;
		this.medicineID = medicineID;
	}
}
