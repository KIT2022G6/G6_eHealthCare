package edu.multicampus.eHealthCare.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
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
}
