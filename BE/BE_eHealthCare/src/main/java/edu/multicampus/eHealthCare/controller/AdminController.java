package edu.multicampus.eHealthCare.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lowagie.text.DocumentException;

import edu.multicampus.eHealthCare.exception.ResourceNotFoundException;
import edu.multicampus.eHealthCare.export.DoctorExcelExporter;
import edu.multicampus.eHealthCare.export.DoctorPDFExporter;
import edu.multicampus.eHealthCare.model.Department;
import edu.multicampus.eHealthCare.model.Doctor;
import edu.multicampus.eHealthCare.model.Insurance;
import edu.multicampus.eHealthCare.model.Schedule;
import edu.multicampus.eHealthCare.repository.DepartmentRepository;
import edu.multicampus.eHealthCare.repository.DoctorRepository;
import edu.multicampus.eHealthCare.repository.InsuranceRepository;
import edu.multicampus.eHealthCare.repository.ScheduleRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {
	@Autowired
	private DepartmentRepository depRepository;
	@Autowired
	private DoctorRepository docRepo;
	@Autowired
	private InsuranceRepository insuranceRepository;
	@Autowired
	private ScheduleRepository schRepository;

	// ============ DEPARTMENT ============//
	@GetMapping("/department") // OK
	public List<Department> getAllDepartments() {
		return depRepository.findAll();
	}

	@PostMapping("/department") // OK
	public Department createDep(@RequestBody Department dep) {
		return depRepository.save(dep);
	}

	@GetMapping("/department/{id}") // OK
	public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
		Department dep = depRepository.findDepByDepartmentID(id);
		return ResponseEntity.ok(dep);
	}

	@PutMapping("/department/{id}") // OK
	public ResponseEntity<Department> updateDep(@PathVariable Long id, @RequestBody Department depDetails) {
		Department dep = depRepository.findDepByDepartmentID(id);
		dep.setDepName(depDetails.getDepName());
		dep.setDepCharge(depDetails.getDepCharge());
		dep.setDepDescription(depDetails.getDepDescription());
		Department updatedDep = depRepository.save(dep);
		return ResponseEntity.ok(updatedDep);
	}

	@DeleteMapping("/department/{id}") // OK
	public ResponseEntity<Map<String, Boolean>> deleteDep(@PathVariable Long id) {
		Department dep = depRepository.findDepByDepartmentID(id);
		depRepository.delete(dep);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

	// ============ DOCTOR ============//
	@GetMapping("/doctor")
	public List<Doctor> getAllDoctors() {
		return docRepo.findAll();
	}

	@GetMapping("/doctor/{id}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable String id) {
		Doctor doc = docRepo.findDoctorByDoctorID(id);
		return ResponseEntity.ok(doc);
	}

	@PostMapping("/doctor") // OK
	public Doctor createDoc(@RequestBody Doctor dep) {
		return docRepo.save(dep);
	}

	@PutMapping("/doctor/{id}") // OK
	public ResponseEntity<Doctor> updateDoc(@PathVariable String id, @RequestBody Doctor docDetails) {
		Doctor doc = docRepo.findDoctorByDoctorID(id);
		doc.setDocAge(docDetails.getDocAge());
		doc.setDocEmail(docDetails.getDocEmail());
		doc.setDocName(docDetails.getDocName());
		doc.setDocPhone(docDetails.getDocPhone());
		doc.setDepartmentID(docDetails.getDepartmentID());
		doc.setScheduleID(docDetails.getScheduleID());
		Doctor updatedDoc = docRepo.save(doc);
		return ResponseEntity.ok(updatedDoc);
	}

	@DeleteMapping("/doctor/{id}") // OK
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
		String currentDateTime = dateFormatter.format(new java.util.Date());

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
		String currentDateTime = dateFormatter.format(new java.util.Date());

		String headerKey = "Content-Disposition";
		String headerValue = "inline; filename=doctors_" + currentDateTime + ".xlsx";
		response.setHeader(headerKey, headerValue);

		List<Doctor> listDoctors = docRepo.findAll();

		DoctorExcelExporter excelExporter = new DoctorExcelExporter(listDoctors);

		excelExporter.export(response);
	}

	// ============ INSURANCE ============//
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

	@PutMapping("/insurance/{id}")
	public ResponseEntity<Insurance> updateInsurance(@PathVariable Long id, @RequestBody Insurance insurance) {
		Insurance ins = insuranceRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Insurance not found with id: " + id));
		ins.setId(insurance.getId());
		ins.setInsName(insurance.getInsName());
		ins.setInsDes(insurance.getInsDes());
		Insurance updateInsurance = insuranceRepository.save(ins);
		return ResponseEntity.ok(updateInsurance);
	}

	@DeleteMapping("/insurance/{id}")
	public ResponseEntity<Map<String, Boolean>> deletePatient(@PathVariable Long id) {
		Insurance ins = insuranceRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Insurance not found with id: " + id));
		insuranceRepository.delete(ins);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

	// ============ SCHEDULE ============//
	@GetMapping("/schedule") // OK
	public List<Schedule> getAllSchedule() {
		return schRepository.findAll();
	}

	@GetMapping("/schedule/{id}") // OK
	public ResponseEntity<Schedule> getScheduleById(@PathVariable String id) {
		Schedule sch = schRepository.findSchByScheduleID(id);
		return ResponseEntity.ok(sch);
	}

	// Lich lam viec theo ngay
	@GetMapping("/schedule/date/{daywork}")
	public List<Schedule> getScheduleByDate(@PathVariable Date daywork) {
		return schRepository.findAllDoctorBySchDate(daywork);
	}

	// Lich lam viec theo khoang thoi gian
	@GetMapping("/schedule/time")
	public List<Schedule> getScheduleByTime(@RequestParam("s") Date date1, @RequestParam("e") Date date2) {
//		List<Schedule> sch = schRepository.findScheByDate(date1, date2);
		List<Schedule> sch = schRepository.findScheduleByScheduleDateBetween(date1, date2);
		return sch;
	}

	@PostMapping("/schedule") // OK
	public Schedule createSch(@RequestBody Schedule sch) {
		return schRepository.save(sch);
	}

	@PutMapping("/schedule/{id}") // OK
	public ResponseEntity<Schedule> updateSch(@PathVariable String id, @RequestBody Schedule schDetails) {
		Schedule sch = schRepository.findSchByScheduleID(id);
		sch.setScheduleDate(schDetails.getScheduleDate());
		sch.setScheduleShift(schDetails.getScheduleShift());
//		sch.setListDoctor(schDetails.getListDoctor());
		Schedule updatedSch = schRepository.save(sch);
		return ResponseEntity.ok(updatedSch);
	}
}
