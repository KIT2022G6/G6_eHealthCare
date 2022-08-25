package edu.multicampus.eHealthCare.controller;

import edu.multicampus.eHealthCare.exception.ResourceNotFoundException;
import edu.multicampus.eHealthCare.model.Insurance;
import edu.multicampus.eHealthCare.model.Patient;
import edu.multicampus.eHealthCare.repository.InsuranceRepository;
import edu.multicampus.eHealthCare.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class InsuranceController {
    @Autowired
    private InsuranceRepository insuranceRepository;

    @GetMapping("/insurance")
    public List<Insurance> getAllInsurances() {
        return insuranceRepository.findAll();
    }

    @PostMapping("/insurance")
    public Insurance createInsurance(@RequestBody Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    @GetMapping("/insurance/{id}")
    public ResponseEntity<Insurance> getInsuranceById(@PathVariable String id) {
        Insurance insurance = insuranceRepository.findInsurancetById(id);
        return ResponseEntity.ok(insurance);
    }

//    @PutMapping("/insurance/{id}")
//    public ResponseEntity<Insurance> updateInsurance(@PathVariable Long id, @RequestBody Insurance insurance) {
//        Insurance ins = insuranceRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Insurance not found with id: " + id));
//        ins.setInsID(insurance.getInsID());
//        ins.setiName(insurance.getiName());
//        ins.setiDes(insurance.getiDes());
//        Insurance updateInsurance = insuranceRepository.save(ins);
//        return ResponseEntity.ok(updateInsurance);
//    }

    @DeleteMapping("/insurance/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePatient(@PathVariable Long id) {
        Insurance ins = insuranceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Insurance not found with id: " + id));
        insuranceRepository.delete(ins);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
