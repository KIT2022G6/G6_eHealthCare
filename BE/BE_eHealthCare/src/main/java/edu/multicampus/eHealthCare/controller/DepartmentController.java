package edu.multicampus.eHealthCare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.multicampus.eHealthCare.exception.ResourceNotFoundException;
import edu.multicampus.eHealthCare.model.Department;
import edu.multicampus.eHealthCare.repository.DepartmentRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class DepartmentController {
	@Autowired
	private DepartmentRepository depRepository;

	@GetMapping("/department")
	public List<Department> getAllDep() {
		return depRepository.findAll();
	}

	@PostMapping("/department")
	public Department createDep(@RequestBody Department dep) {
		return depRepository.save(dep);
	}

	@PutMapping("/department/{id}")
	public ResponseEntity<Department> updateDep(@PathVariable Long id, @RequestBody Department depDetails) {
		Department dep = depRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Department not found with id: "+id));

		dep.setdName(depDetails.getdName());
		dep.setdCharge(depDetails.getdCharge());
		dep.setdDes(depDetails.getdDes());
		Department updatedDep = depRepository.save(dep);
		return ResponseEntity.ok(updatedDep);
	}
}
