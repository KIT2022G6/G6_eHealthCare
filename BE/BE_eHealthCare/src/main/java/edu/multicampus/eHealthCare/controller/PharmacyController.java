package edu.multicampus.eHealthCare.controller;

import edu.multicampus.eHealthCare.exception.ResourceNotFoundException;
import edu.multicampus.eHealthCare.model.Pharmacy;
import edu.multicampus.eHealthCare.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class PharmacyController {
    @Autowired
    private PharmacyRepository pharmacyRepository;

    @GetMapping("/pharmacy")
    public List<Pharmacy> getAllPharmacys() {
        return pharmacyRepository.findAll();
    }

    @PostMapping("/pharmacy")
    public Pharmacy createPharmacy(@RequestBody Pharmacy pharmacy) {
        return pharmacyRepository.save(pharmacy);
    }

    @GetMapping("/pharmacy/{id}")
    public ResponseEntity<Pharmacy> getMedicineById(@PathVariable String id) {
        Pharmacy pharmacy = pharmacyRepository.findPharmacyByPharmacyID(id);
        return ResponseEntity.ok(pharmacy);
    }
//    public Pharmacy getMedicineById(@PathVariable Long id) {
//        return pharmacyRepository.findPharmacyById(id);
//
//    }

    @PutMapping("/pharmacy/{id}")
    public ResponseEntity<Pharmacy> updatePharmacy(@PathVariable Long id, @RequestBody Pharmacy pharmacy) {
        Pharmacy pha = pharmacyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pharmacy not found with id: " + id));
        pha.setPharmacyID(pharmacy.getPharmacyID());
        pha.setPhUsername(pharmacy.getPhUsername());
        pha.setPhPassword(pharmacy.getPhPassword());
        pha.setPhName(pharmacy.getPhName());
        pha.setPhDes(pharmacy.getPhDes());
        pha.setListTotalInvoice(pharmacy.getListTotalInvoice());
        Pharmacy updatePharmacy = pharmacyRepository.save(pha);
        return ResponseEntity.ok(updatePharmacy);
    }

    @DeleteMapping("/pharmacy/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePharmacy(@PathVariable Long id) {
        Pharmacy pha = pharmacyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pharmacy not found with id: " + id));
        pharmacyRepository.delete(pha);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}


