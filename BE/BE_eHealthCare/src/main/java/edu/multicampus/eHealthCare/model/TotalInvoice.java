package edu.multicampus.eHealthCare.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@ToString
public class TotalInvoice {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "invoiceID", unique = true)
	private String invoiceID;

	private Date tPrint;

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

	public TotalInvoice(String invoiceID, Date tPrint, Appointment appointmentID, MedInvoice medInvoiceID, Pharmacy pharmacyID) {
		this.invoiceID = invoiceID;
		this.tPrint = tPrint;
		this.appointmentID = appointmentID;
		this.medInvoiceID = medInvoiceID;
		this.pharmacyID = pharmacyID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Date gettPrint() {
		return tPrint;
	}

	public void settPrint(Date tPrint) {
		this.tPrint = tPrint;
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
