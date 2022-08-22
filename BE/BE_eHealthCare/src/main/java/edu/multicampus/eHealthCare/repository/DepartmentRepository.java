package edu.multicampus.eHealthCare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.multicampus.eHealthCare.model.Department;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	Department findDepByDepID(String depID);

	@Query(value = "SELECT * FROM department WHERE departmentid =?", nativeQuery=true)
	public Department findDepByDepId(String depID);

	
}
