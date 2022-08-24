package edu.multicampus.eHealthCare.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//public class Doctor implements Serializable {
public class Doctor{
//	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long doctorID;

//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doc_seq") 
//	@GenericGenerator(
//	        name = "doc_seq", 
//	        strategy = "edu.multicampus.eHealthCare.model.CodeGenerator", 
//	        parameters = {
//	        	@Parameter(name = CodeGenerator.INCREMENT_PARAM, value = "50"),
//	            @Parameter(name = CodeGenerator.VALUE_PREFIX_PARAMETER, value = "BS_"),
//	            @Parameter(name = CodeGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
//	private String doctorID;

	@Column(nullable = false)
	private String docName, docPhone, docEmail;
	@Column(columnDefinition = "INT(3) UNSIGNED")
	private int docAge;

	@ManyToOne
	@JoinColumn(name = "fk_departmentid")
	private Department departmentID;

	@ManyToOne
	@JoinColumn(name = "fk_scheduleID")
	private Schedule scheduleID;

//	@OneToMany(mappedBy = "doctorID", cascade = CascadeType.ALL)
//	@JsonIgnore
//	private Set<Appointment> listAppointment;

	public String getdName() {
		return docName;
	}

	public Long getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(Long doctorID) {
		this.doctorID = doctorID;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocPhone() {
		return docPhone;
	}

	public void setDocPhone(String docPhone) {
		this.docPhone = docPhone;
	}

	public String getDocEmail() {
		return docEmail;
	}

	public void setDocEmail(String docEmail) {
		this.docEmail = docEmail;
	}

	public int getDocAge() {
		return docAge;
	}

	public void setDocAge(int docAge) {
		this.docAge = docAge;
	}

//	public Set<Appointment> getListAppointment() {
//		return listAppointment;
//	}
//
//	public void setListAppointment(Set<Appointment> listAppointment) {
//		this.listAppointment = listAppointment;
//	}

	public Department getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Department departmentID) {
		this.departmentID = departmentID;
	}

	public Schedule getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(Schedule scheduleID) {
		this.scheduleID = scheduleID;
	}

	public Doctor() {
		super();
	}

}
