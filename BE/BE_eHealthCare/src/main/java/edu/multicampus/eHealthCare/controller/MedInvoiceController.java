package edu.multicampus.eHealthCare.controller;

import edu.multicampus.eHealthCare.exception.ResourceNotFoundException;
import edu.multicampus.eHealthCare.model.MedInvoice;
import edu.multicampus.eHealthCare.model.Pharmacy;
import edu.multicampus.eHealthCare.repository.MedInvoiceRepository;
import edu.multicampus.eHealthCare.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class MedInvoiceController {
    @Autowired
    private MedInvoiceRepository medInvoiceRepository;

    @GetMapping("/medInvoice")
    public List<MedInvoice> getAllMedInvoices() {
        return medInvoiceRepository.findAll();
    }

    @PostMapping("/medInvoice")
    public MedInvoice createMedInvoice(@RequestBody MedInvoice medInvoice) {
        return medInvoiceRepository.save(medInvoice);
    }

    @GetMapping("/medInvoice/{id}")
    public ResponseEntity<MedInvoice> getMedicineById(@PathVariable String id) {
        MedInvoice medInvoice = medInvoiceRepository.findMedicineById(id);
        return ResponseEntity.ok(medInvoice);
    }

    @PutMapping("/medInvoice/{id}")
    public ResponseEntity<MedInvoice> updatePharmacy(@PathVariable Long id, @RequestBody MedInvoice medInvoice) {
        MedInvoice medi = medInvoiceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("MedInvoice not found with id: " + id));
        medi.setMedInvoiceID(medInvoice.getMedInvoiceID());
        medi.setPrescriptionID(medInvoice.getPrescriptionID());
        medi.setMedicineID(medInvoice.getMedicineID());
        MedInvoice updateMedInvoice= medInvoiceRepository.save(medi);
        return ResponseEntity.ok(updateMedInvoice);
    }

    @DeleteMapping("/medInvoice/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePharmacy(@PathVariable Long id) {
        MedInvoice medi = medInvoiceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("MedInvoice not found with id: " + id));
        medInvoiceRepository.delete(medi);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}


