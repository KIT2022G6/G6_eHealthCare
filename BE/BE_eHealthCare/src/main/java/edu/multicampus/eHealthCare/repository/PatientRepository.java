package edu.multicampus.eHealthCare.repository;

import edu.multicampus.eHealthCare.model.Department;
import edu.multicampus.eHealthCare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Query(value = "SELECT * FROM patient WHERE patientid =?",
            nativeQuery=true)
    public Patient findPatientById(String patientID);
}
