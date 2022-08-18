package edu.multicampus.eHealthCare.model;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Doctor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "doctorID", unique = true)
	private String doctorID;

	@Column(nullable = false)
	private String dName, dPhone, dEmail, dUsername, dPassword;
	@Column(columnDefinition = "INT(3) UNSIGNED")
	private int dAge;

	@JsonIgnore
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "fk_departmentid")
	private Department departmentID;

	@ManyToOne
	@JoinColumn(name = "fk_scheduleID")
	private Schedule scheduleID;

//	@OneToMany(mappedBy = "docID", cascade = CascadeType.ALL)
//	private Set<Appointment> listAppointment

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
