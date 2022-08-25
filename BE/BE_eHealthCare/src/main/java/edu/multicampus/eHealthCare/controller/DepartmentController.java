package edu.multicampus.eHealthCare.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.multicampus.eHealthCare.model.Department;
import edu.multicampus.eHealthCare.repository.DepartmentRepository;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class DepartmentController {
	@Autowired
	private DepartmentRepository depRepository;

	@GetMapping("/department") //OK
	public List<Department> getAllDepartments() {
		return depRepository.findAll();
	}

	@PostMapping("/department") //OK
	public Department createDep(@RequestBody Department dep) {
		return depRepository.save(dep);
	}

	@GetMapping("/department/{id}") //OK
	public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
		Department dep = depRepository.findDepByDepartmentID(id);

		return ResponseEntity.ok(dep);
	}

//	@PutMapping("/department/{id}") //OK
//	public ResponseEntity<Department> updateDep(@PathVariable String id, @RequestBody Department depDetails) {
//		Department dep = depRepository.findDepByDepID(id);
//		dep.setdName(depDetails.getdName());
//		dep.setdCharge(depDetails.getdCharge());
//		dep.setdDes(depDetails.getdDes());
//		Department updatedDep = depRepository.save(dep);
//		return ResponseEntity.ok(updatedDep);
//	}

	@DeleteMapping("/department/{id}") //OK
	public ResponseEntity<Map<String, Boolean>> deleteDep(@PathVariable Long id) {
		Department dep = depRepository.findDepByDepartmentID(id);
		depRepository.delete(dep);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
