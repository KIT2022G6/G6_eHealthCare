package edu.multicampus.eHealthCare.controller;

import edu.multicampus.eHealthCare.exception.ResourceNotFoundException;
import edu.multicampus.eHealthCare.model.Insurance;
import edu.multicampus.eHealthCare.model.Medicine;
import edu.multicampus.eHealthCare.repository.InsuranceRepository;
import edu.multicampus.eHealthCare.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


    @RestController
    @RequestMapping("/api/v1/")
    public class MedicineController {
        @Autowired
        private MedicineRepository medicineRepository;

        @GetMapping("/medicine")
        public List<Medicine> getAllMedicines() {
            return medicineRepository.findAll();
        }

        @PostMapping("/medicine")
        public Medicine createMedicine(@RequestBody Medicine medicine) {
            return medicineRepository.save(medicine);
        }

        @GetMapping("/medicine/{id}")
        public ResponseEntity<Medicine> getMedicineById(@PathVariable String id) {
            Medicine medicine = medicineRepository.findMedicineById(id);
            return ResponseEntity.ok(medicine);
        }

        @PutMapping("/medicine/{id}")
        public ResponseEntity<Medicine> updateMedicine(@PathVariable Long id, @RequestBody Medicine medicine) {
            Medicine med = medicineRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Medicine not found with id: " + id));
            med.setMedicineID(medicine.getMedicineID());
            med.setMedName(medicine.getMedName());
            med.setMedExp(medicine.getMedExp());
            med.setMedStorage(medicine.getMedStorage());
            med.setMedPrice(medicine.getMedPrice());
            Medicine updateMedicine = medicineRepository.save(med);
            return ResponseEntity.ok(updateMedicine);
        }

        @DeleteMapping("/medicine/{id}")
        public ResponseEntity<Map<String, Boolean>> deleteMedicine(@PathVariable Long id) {
            Medicine med = medicineRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Medicine not found with id: " + id));
            medicineRepository.delete(med);
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.TRUE);
            return ResponseEntity.ok(response);
        }
    }
