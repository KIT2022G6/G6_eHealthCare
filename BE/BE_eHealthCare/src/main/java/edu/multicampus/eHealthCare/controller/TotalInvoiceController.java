package edu.multicampus.eHealthCare.controller;

import edu.multicampus.eHealthCare.exception.ResourceNotFoundException;
import edu.multicampus.eHealthCare.model.TotalInvoice;
import edu.multicampus.eHealthCare.repository.TotalInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class TotalInvoiceController {
    @Autowired
    private TotalInvoiceRepository totalInvoiceRepository;

    @GetMapping("/totalInvoice")
    public List<TotalInvoice> getAllTotalInvoices() {
        return totalInvoiceRepository.findAll();
    }

    @PostMapping("/totalInvoice")
    public TotalInvoice createTotalInvoice(@RequestBody TotalInvoice totalInvoice) {
        return totalInvoiceRepository.save(totalInvoice);
    }

    @GetMapping("/totalInvoice/{id}")
    public ResponseEntity<TotalInvoice> getMedicineById(@PathVariable String id) {
        TotalInvoice totalInvoice = totalInvoiceRepository.findTotalInvoiceById(id);
        return ResponseEntity.ok(totalInvoice);
    }

    @PutMapping("/totalInvoice/{id}")
    public ResponseEntity<TotalInvoice> updateTotalInvoice(@PathVariable Long id, @RequestBody TotalInvoice totalInvoice) {
        TotalInvoice tot = totalInvoiceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("TotalInvoice not found with id: " + id));
        tot.setInvoiceID(totalInvoice.getInvoiceID());
        tot.settPrint(totalInvoice.gettPrint());
        tot.setAppointmentID(totalInvoice.getAppointmentID());
        tot.setMedInvoiceID(totalInvoice.getMedInvoiceID());
        tot.setPharmacyID(totalInvoice.getPharmacyID());
        TotalInvoice updateTotalInvoice = totalInvoiceRepository.save(tot);
        return ResponseEntity.ok(updateTotalInvoice);
    }

    @DeleteMapping("/totalInvoice/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePharmacy(@PathVariable Long id) {
        TotalInvoice tot = totalInvoiceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("TotalInvoice not found with id: " + id));
        totalInvoiceRepository.delete(tot);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}