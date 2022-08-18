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
import edu.multicampus.eHealthCare.model.MedicalRecord;
import edu.multicampus.eHealthCare.repository.MedicalRecordRepository;

@RestController
@RequestMapping("/api/v1/")
public class MedicalRecordController {
	@Autowired
	private MedicalRecordRepository recordRepo;
	
	@GetMapping("/record")
	public List<MedicalRecord> getAllRecords() {
		return recordRepo.findAll();
	}

	@GetMapping("/record/{id}")
	public ResponseEntity<MedicalRecord> getRecordById(@PathVariable String id) {
		MedicalRecord rec = recordRepo.findMedicalRecordByRecordID(id);
		return ResponseEntity.ok(rec);
	}
	
	@PostMapping("/record") //OK
	public MedicalRecord createDoc(@RequestBody MedicalRecord rec) {
		return recordRepo.save(rec);
	}
	
	@PutMapping("/record/{id}") //OK
	public ResponseEntity<MedicalRecord> updateDoc(@PathVariable String id, @RequestBody MedicalRecord recDetails) {
		MedicalRecord rec = recordRepo.findMedicalRecordByRecordID(id);
		rec.setpDia(recDetails.getpDia());
		rec.setpHis(recDetails.getpHis());
		rec.setListAppointment(recDetails.getListAppointment());
		rec.setPrescriptionID(recDetails.getPrescriptionID());
		MedicalRecord updatedRec = recordRepo.save(rec);
		return ResponseEntity.ok(updatedRec);
	}
	
	@DeleteMapping("/record/{id}") //OK
	public ResponseEntity<Map<String, Boolean>> deleteRec(@PathVariable String id) {
		MedicalRecord rec = recordRepo.findMedicalRecordByRecordID(id);
		recordRepo.delete(rec);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
