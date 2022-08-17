package edu.multicampus.eHealthCare.controller;

import edu.multicampus.eHealthCare.model.Patient;
import edu.multicampus.eHealthCare.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping("/patient")
    public List<Patient> getAllPatent() {
        return patientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id) {
        return patientRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping("/patient")
    public ResponseEntity createClient(@RequestBody Patient patient) throws URISyntaxException {
        Patient savedPatient = patientRepository.save(patient);
        return ResponseEntity.created(new URI("/patients/" + savedPatient.getId())).body(savedPatient);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deletePatient(@PathVariable Long id) {
        patientRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}