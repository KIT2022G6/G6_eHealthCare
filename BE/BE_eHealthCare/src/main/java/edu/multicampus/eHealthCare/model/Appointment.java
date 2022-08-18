package edu.multicampus.eHealthCare.model;




import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
public class Appointment {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "appointmentID", unique = true)
	private String appointmentID;

	private int pOrd, pRoo;
	private Date pVsi;

	@ManyToOne
	@JoinColumn(name = "doctorID")
	private Doctor docID;

	@ManyToOne
	@JoinColumn(name = "patientID")
	private Patient patID;

	@ManyToOne
	@JoinColumn(name = "recordID")
	private MedicalRecord recordID;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}

	public int getpOrd() {
		return pOrd;
	}

	public void setpOrd(int pOrd) {
		this.pOrd = pOrd;
	}

	public int getpRoo() {
		return pRoo;
	}

	public void setpRoo(int pRoo) {
		this.pRoo = pRoo;
	}

	public Date getpVsi() {
		return pVsi;
	}

	public void setpVsi(Date pVsi) {
		this.pVsi = pVsi;
	}

	public Doctor getDocID() {
		return docID;
	}

	public void setDocID(Doctor docID) {
		this.docID = docID;
	}

	public Patient getPatID() {
		return patID;
	}

	public void setPatID(Patient patID) {
		this.patID = patID;
	}

	public MedicalRecord getRecordID() {
		return recordID;
	}

	public void setRecordID(MedicalRecord recordID) {
		this.recordID = recordID;
	}
	
	
}
