package edu.multicampus.eHealthCare.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Pharmacy {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "pharmacyID", unique = true)
	private String pharmacyID;
	
	@Column(nullable = false)
	private String phUsername, phPassword;
	
	@Column(name = "phName")
	private String phName;

	@Column(name = "phDescription")
	private String phDes;

	@OneToMany(mappedBy = "pharmacyID", cascade = CascadeType.ALL)
	private Set<TotalInvoice> listTotalInvoice;
	
}
