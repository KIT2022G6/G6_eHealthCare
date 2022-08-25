package edu.multicampus.eHealthCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.multicampus.eHealthCare.model.Appointment;
import edu.multicampus.eHealthCare.repository.AppointmentRepository;

@RestController
@RequestMapping("/api/v1/")
public class AppointmentController {
	@Autowired
	private AppointmentRepository apoRepo;

	@GetMapping("/appointment")
	public List<Appointment> getAllAppointments() {
		return apoRepo.findAll();
	}

	@GetMapping("/appointment/{id}")
	public ResponseEntity<Appointment> getPrescriptionById(@PathVariable String id) {
		Appointment pre = apoRepo.findAppointByAppointmentID(id);
		return ResponseEntity.ok(pre);
	}

	@PostMapping("/appointment")
	public Appointment createDoc(@RequestBody Appointment pre) {
		return apoRepo.save(pre);
	}

	@PutMapping("/appointment/{id}")
	public ResponseEntity<Appointment> updateApo(@PathVariable String id, @RequestBody Appointment apoDetails) {
		Appointment apo = apoRepo.findAppointByAppointmentID(id);
		apo.setOrdinalNum(apoDetails.getOrdinalNum());
		apo.setRoom(apoDetails.getRoom());
		apo.setVisitDate(apoDetails.getVisitDate());
		apo.setDocterID(apoDetails.getDocterID());
		apo.setPatientID(apoDetails.getPatientID());
		Appointment updatedApo = apoRepo.save(apo);
		return ResponseEntity.ok(updatedApo);
	}
}
