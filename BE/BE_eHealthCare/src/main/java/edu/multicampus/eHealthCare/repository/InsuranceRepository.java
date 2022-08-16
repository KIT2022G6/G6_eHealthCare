package edu.multicampus.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.multicampus.eHealthCare.model.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Long>{
	
}
