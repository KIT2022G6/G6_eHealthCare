package edu.multicampus.eHealthCare.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

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

import com.lowagie.text.DocumentException;

import edu.multicampus.eHealthCare.export.DoctorExcelExporter;
import edu.multicampus.eHealthCare.export.DoctorPDFExporter;
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
	
	@GetMapping("doctors/export/pdf")
	public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "inline; filename=doctors_" + currentDateTime + ".pdf";
        // headerValue = attachment == download 
        response.setHeader(headerKey, headerValue);
         
        List<Doctor> listDoctors = docRepo.findAll();
         
        DoctorPDFExporter exporter = new DoctorPDFExporter(listDoctors);
        exporter.export(response);
         
    }
	@GetMapping("/doctors/export/excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "inline; filename=doctors_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
        List<Doctor> listDoctors = docRepo.findAll();
         
        DoctorExcelExporter excelExporter = new DoctorExcelExporter(listDoctors);
         
        excelExporter.export(response);    
    }  
}
