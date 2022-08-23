package edu.multicampus.eHealthCare.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import java.io.Serializable;

@Entity
public class Doctor implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doc_seq") 
//	@GenericGenerator(
//	        name = "doc_seq", 
//	        strategy = "edu.multicampus.eHealthCare.model.CodeGenerator", 
//	        parameters = {
//	        	@Parameter(name = CodeGenerator.INCREMENT_PARAM, value = "50"),
//	            @Parameter(name = CodeGenerator.VALUE_PREFIX_PARAMETER, value = "BS_"),
//	            @Parameter(name = CodeGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String doctorID;

	@Column(nullable = false)
	private String dName, dPhone, dEmail, dUsername, dPassword;
	@Column(columnDefinition = "INT(3) UNSIGNED")
	private int dAge;

	@ManyToOne
	@JoinColumn(name = "fk_departmentid")
	private Department departmentID;

	@ManyToOne
	@JoinColumn(name = "fk_scheduleID")
	private Schedule scheduleID;

//	@OneToMany(mappedBy = "docID", cascade = CascadeType.ALL)
//	private Set<Appointment> listAppointment


	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdPhone() {
		return dPhone;
	}

	public void setdPhone(String dPhone) {
		this.dPhone = dPhone;
	}

	public String getdEmail() {
		return dEmail;
	}

	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
	}

	public String getdUsername() {
		return dUsername;
	}

	public void setdUsername(String dUsername) {
		this.dUsername = dUsername;
	}

	public String getdPassword() {
		return dPassword;
	}

	public void setdPassword(String dPassword) {
		this.dPassword = dPassword;
	}

	public int getdAge() {
		return dAge;
	}

	public void setdAge(int dAge) {
		this.dAge = dAge;
	}

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

	// @OneToMany(mappedBy = "docID", cascade = CascadeType.ALL)
	// @JsonIgnore
	// private Set<Appointment> listAppointment;
}
