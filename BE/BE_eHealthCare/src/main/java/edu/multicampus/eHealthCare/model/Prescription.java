package edu.multicampus.eHealthCare.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Prescription {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Id
	@Column(name = "prescriptionID", unique = true)
	private String precriptionID;

	private int pAmo, pDos;
	private String pDet;

    @OneToMany(mappedBy = "recordID", cascade = CascadeType.ALL)
	private Set<MedicalRecord> listRecord;
    
	@OneToMany(mappedBy = "precriptionID", cascade = CascadeType.ALL)
	private Set<MedInvoice> listMedInvoice;

}
