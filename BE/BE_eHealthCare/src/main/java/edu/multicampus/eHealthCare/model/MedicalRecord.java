package edu.multicampus.eHealthCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MedicalRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recordID;

	private String Diagnose;
	private String History;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_prescriptionID", nullable = false)
	private Prescription prescriptionID;

	@OneToMany(mappedBy = "recordID", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Appointment> listAppointment;

	public MedicalRecord() {
		super();
	}

	public MedicalRecord(String diagnose, String history, Prescription prescriptionID,
			Set<Appointment> listAppointment) {
		super();
		Diagnose = diagnose;
		History = history;
		this.prescriptionID = prescriptionID;
		this.listAppointment = listAppointment;
	}
	
	public Long getRecordID() {
		return recordID;
	}

	public void setRecordID(Long recordID) {
		this.recordID = recordID;
	}

	public String getDiagnose() {
		return Diagnose;
	}

	public void setDiagnose(String diagnose) {
		Diagnose = diagnose;
	}

	public String getHistory() {
		return History;
	}

	public void setHistory(String history) {
		History = history;
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
