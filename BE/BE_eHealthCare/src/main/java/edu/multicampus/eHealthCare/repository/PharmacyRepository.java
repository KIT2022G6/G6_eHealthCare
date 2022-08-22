package edu.multicampus.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.multicampus.eHealthCare.model.Pharmacy;
@Repository
public interface PharmacyRepository extends JpaRepository<Pharmacy, Long>{

    public Pharmacy findPharmacyByPharmacyID(String pharmacyID);
}
