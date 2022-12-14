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

import edu.multicampus.eHealthCare.model.Prescription;
import edu.multicampus.eHealthCare.repository.PrescriptionRepository;

@RestController
@RequestMapping("/api/v1/")
public class PrescriptionController {
	@Autowired
	private PrescriptionRepository preRepo;

	@GetMapping("/prescription")
	public List<Prescription> getAllPrescriptions() {
		return preRepo.findAll();
	}

	@GetMapping("/prescription/{id}")
	public ResponseEntity<Prescription> getDoctorById(@PathVariable String id) {
		Prescription pre = preRepo.findPrescriptionByPrecriptionID(id);
		return ResponseEntity.ok(pre);
	}

	@PostMapping("/prescription")
	public Prescription createDoc(@RequestBody Prescription pre) {
		return preRepo.save(pre);
	}

	@PutMapping("/prescription/{id}") 
	public ResponseEntity<Prescription> updatePre(@PathVariable String id, @RequestBody Prescription preDetails) {
		Prescription pre = preRepo.findPrescriptionByPrecriptionID(id);
		pre.setpAmo(preDetails.getpAmo());
		pre.setpDet(preDetails.getpDet());
		pre.setpDos(preDetails.getpDos());
		Prescription updatedPre = preRepo.save(pre);
		return ResponseEntity.ok(updatedPre);
		
	}

	@DeleteMapping("/prescription/{id}") 
	public ResponseEntity<Map<String, Boolean>> deletePre(@PathVariable String id) {
		Prescription pre = preRepo.findPrescriptionByPrecriptionID(id);
		preRepo.delete(pre);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
