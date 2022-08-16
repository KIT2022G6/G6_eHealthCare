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
public class Schedule {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Id
	@Column(name = "scheduleID", unique = true)
	private String schID;

	private String sWor, sShi;
	
	@ManyToOne
	@JoinColumn(name = "fk_doctorID")
	private Doctor doctorID;
	
	@OneToMany(mappedBy = "schID", cascade = CascadeType.ALL)
	private Set<Doctor> listDoctor;
}
