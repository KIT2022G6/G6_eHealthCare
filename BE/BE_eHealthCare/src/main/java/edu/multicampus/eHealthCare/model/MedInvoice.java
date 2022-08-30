package edu.multicampus.eHealthCare.model;

import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
public class MedInvoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long medInvoiceID;
	@ManyToOne
	@JoinColumn(name = "fk_prescriptionID")
	private Prescription prescriptionID;

	@ManyToOne
	@JoinColumn(name = "fk_medicineID")
	private Medicine medicineID;

	public MedInvoice() {
		super();
	}

	public MedInvoice(Prescription prescriptionID, Medicine medicineID) {
		super();
		this.prescriptionID = prescriptionID;
		this.medicineID = medicineID;
	}

	public Long getMedInvoiceID() {
		return medInvoiceID;
	}

	public void setMedInvoiceID(Long medInvoiceID) {
		this.medInvoiceID = medInvoiceID;
	}

	public Prescription getPrescriptionID() {
		return prescriptionID;
	}

	public void setPrescriptionID(Prescription prescriptionID) {
		this.prescriptionID = prescriptionID;
	}

	public Medicine getMedicineID() {
		return medicineID;
	}

	public void setMedicineID(Medicine medicineID) {
		this.medicineID = medicineID;
	}
	
}
