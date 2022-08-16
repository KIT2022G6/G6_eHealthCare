package edu.multicampus.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.multicampus.eHealthCare.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
}
