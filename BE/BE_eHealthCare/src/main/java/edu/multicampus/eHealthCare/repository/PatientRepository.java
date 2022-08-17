package edu.multicampus.eHealthCare.repository;

import edu.multicampus.eHealthCare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface PatientRepository extends JpaRepository<Patient, Long> {
}
