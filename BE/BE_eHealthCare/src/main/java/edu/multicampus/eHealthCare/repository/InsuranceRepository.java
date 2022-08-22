package edu.multicampus.eHealthCare.repository;

import edu.multicampus.eHealthCare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.multicampus.eHealthCare.model.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
    @Query(value = "SELECT * FROM insurance WHERE insuranceid =?",
            nativeQuery = true)
    public Insurance findInsurancetById(String insID);

}
