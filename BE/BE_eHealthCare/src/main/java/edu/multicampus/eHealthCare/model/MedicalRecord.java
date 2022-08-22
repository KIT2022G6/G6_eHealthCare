package edu.multicampus.eHealthCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
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


    @OneToMany(mappedBy = "recordID", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Appointment> listAppointment;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRecordID() {
		return recordID;
	}


	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}


	public String getpDia() {
		return pDia;
	}


	public void setpDia(String pDia) {
		this.pDia = pDia;
	}


	public String getpHis() {
		return pHis;
	}


	public void setpHis(String pHis) {
		this.pHis = pHis;
	}


	public Prescription getPrescriptionID() {
		return prescriptionID;
	}


	public void setPrescriptionID(Prescription prescriptionID) {
		this.prescriptionID = prescriptionID;
	}


	public Set<Appointment> getListAppointment() {
		return listAppointment;
	}


	public void setListAppointment(Set<Appointment> listAppointment) {
		this.listAppointment = listAppointment;
	}
    

}
