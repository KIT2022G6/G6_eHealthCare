package edu.multicampus.eHealthCare.model;

import javax.persistence.*;


import java.sql.Date;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appointmentID;

	private int ordinalNum, room;
	private Date visitDate;

	@ManyToOne
	@JoinColumn(name = "fk_doctorID")
	private Doctor docterID;

	@ManyToOne
	@JoinColumn(name = "fk_patientID")
	private Patient patientID;

	@ManyToOne
	@JoinColumn(name = "fk_recordID")
	private MedicalRecord recordID;

	public Appointment() {
		super();
	}

	public Appointment(int ordinalNum, int room, Date visitDate, Doctor docterID, Patient patientID,
			MedicalRecord recordID) {
		super();
		this.ordinalNum = ordinalNum;
		this.room = room;
		this.visitDate = visitDate;
		this.docterID = docterID;
		this.patientID = patientID;
		this.recordID = recordID;
	}

	public Long getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(Long appointmentID) {
		this.appointmentID = appointmentID;
	}

	public int getOrdinalNum() {
		return ordinalNum;
	}

	public void setOrdinalNum(int ordinalNum) {
		this.ordinalNum = ordinalNum;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public Doctor getDocterID() {
		return docterID;
	}

	public void setDocterID(Doctor docterID) {
		this.docterID = docterID;
	}

	public Patient getPatientID() {
		return patientID;
	}

	public void setPatientID(Patient patientID) {
		this.patientID = patientID;
	}

	public MedicalRecord getRecordID() {
		return recordID;
	}

	public void setRecordID(MedicalRecord recordID) {
		this.recordID = recordID;
	}
}
