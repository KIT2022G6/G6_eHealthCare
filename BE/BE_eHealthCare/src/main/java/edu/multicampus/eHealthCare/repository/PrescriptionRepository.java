package edu.multicampus.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.multicampus.eHealthCare.model.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long>{
	Prescription findPrescriptionByPrescriptionID(Long preID);
}
