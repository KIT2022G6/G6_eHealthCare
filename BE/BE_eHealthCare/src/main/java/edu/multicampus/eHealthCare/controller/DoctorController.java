package edu.multicampus.eHealthCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
