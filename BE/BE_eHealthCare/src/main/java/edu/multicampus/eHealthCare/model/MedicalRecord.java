package edu.multicampus.eHealthCare.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class MedicalRecord {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Id
    @Column(name = "recordID", unique = true)
    private String recordID;

    private String pDia;
    private String pHis;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prescriptionID", nullable = false)
    private Prescription prescriptionID;

    @ManyToOne
	@JoinColumn(name = "appointmentID")
	private Appointment appointmentID;
	
    
    
}
