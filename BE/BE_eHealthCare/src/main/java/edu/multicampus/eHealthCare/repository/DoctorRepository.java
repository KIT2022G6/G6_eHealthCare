package edu.multicampus.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.multicampus.eHealthCare.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
//	@Query(value = "SELECT * FROM doctor WHERE doctorid =?", nativeQuery = true)
//	public Doctor findDocByDocId(String docID);
	
	Doctor findDoctorByDoctorID(String docID);
	
	
}
