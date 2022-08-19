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

import edu.multicampus.eHealthCare.model.Doctor;
import edu.multicampus.eHealthCare.repository.DoctorRepository;

@RestController
@RequestMapping("/api/v1/")
public class DoctorController {
	@Autowired
	private DoctorRepository docRepo;

	@GetMapping("/doctor")
	public List<Doctor> getAllDoctors() {
		return docRepo.findAll();
	}

	@GetMapping("/doctor/{id}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable String id) {
		Doctor doc = docRepo.findDoctorByDoctorID(id);
		return ResponseEntity.ok(doc);
	}
	
	@PostMapping("/doctor") //OK
	public Doctor createDoc(@RequestBody Doctor dep) {
		return docRepo.save(dep);
	}
	
	@PutMapping("/doctor/{id}") //OK
	public ResponseEntity<Doctor> updateDoc(@PathVariable String id, @RequestBody Doctor docDetails) {
		Doctor doc = docRepo.findDoctorByDoctorID(id);
		doc.setdAge(docDetails.getdAge());
		doc.setdEmail(docDetails.getdEmail());
		doc.setdName(docDetails.getdName());
		doc.setdPhone(docDetails.getdPhone());
		doc.setdUsername(docDetails.getdUsername());
		doc.setdPassword(docDetails.getdPassword());
		doc.setDepartmentID(docDetails.getDepartmentID());
		doc.setScheduleID(docDetails.getScheduleID());
		Doctor updatedDoc = docRepo.save(doc);
		return ResponseEntity.ok(updatedDoc);
	}

	@DeleteMapping("/doctor/{id}") //OK
	public ResponseEntity<Map<String, Boolean>> deleteDoc(@PathVariable String id) {
		Doctor doc = docRepo.findDoctorByDoctorID(id);
		docRepo.delete(doc);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
