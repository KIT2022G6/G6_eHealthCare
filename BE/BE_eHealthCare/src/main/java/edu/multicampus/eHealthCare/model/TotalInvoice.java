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
	@JoinColumn(name = "papID", nullable = false)
	private Appointment papID;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "medInvoiceID", nullable = false)
	private MedInvoice medInvoiceID;
	
	@ManyToOne
	@JoinColumn(name = "pharmacyID")
	private Pharmacy pharmacyID;
}
