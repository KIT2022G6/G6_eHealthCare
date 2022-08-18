package edu.multicampus.eHealthCare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.multicampus.eHealthCare.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	Department findDepByDepID(String depID);
	
	
}
