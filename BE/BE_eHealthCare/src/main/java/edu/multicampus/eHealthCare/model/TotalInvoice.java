package edu.multicampus.eHealthCare.model;

import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@ToString
public class TotalInvoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long invoiceID;
	private Date printDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "appointmentID", nullable = false)
	private Appointment appointmentID;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "medInvoiceID", nullable = false)
	private MedInvoice medInvoiceID;

	@ManyToOne
	@JoinColumn(name = "pharmacyID")
	private Pharmacy pharmacyID;

	public TotalInvoice() {
	}

	public Long getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(Long invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Date getPrintDate() {
		return printDate;
	}

	public void setPrintDate(Date printDate) {
		this.printDate = printDate;
	}

	public TotalInvoice(Date printDate, Appointment appointmentID, MedInvoice medInvoiceID, Pharmacy pharmacyID) {
		super();
		this.printDate = printDate;
		this.appointmentID = appointmentID;
		this.medInvoiceID = medInvoiceID;
		this.pharmacyID = pharmacyID;
	}

	public Appointment getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(Appointment appointmentID) {
		this.appointmentID = appointmentID;
	}

	public MedInvoice getMedInvoiceID() {
		return medInvoiceID;
	}

	public void setMedInvoiceID(MedInvoice medInvoiceID) {
		this.medInvoiceID = medInvoiceID;
	}

	public Pharmacy getPharmacyID() {
		return pharmacyID;
	}

	public void setPharmacyID(Pharmacy pharmacyID) {
		this.pharmacyID = pharmacyID;
	}
}
