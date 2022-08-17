package edu.multicampus.eHealthCare.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.multicampus.eHealthCare.model.Schedule;
import edu.multicampus.eHealthCare.repository.ScheduleRepository;

@RestController
@RequestMapping("/api/v1/")
public class ScheduleController {
	@Autowired
	private ScheduleRepository schRepository;

	@GetMapping("/schedule") //OK
	public List<Schedule> getAllSchedule() {
		return schRepository.findAll();
	}

	@GetMapping("/schedule/{id}") // OK
	public ResponseEntity<Schedule> getScheduleById(@PathVariable String id) {
		Schedule sch = schRepository.findSchById(id);
		return ResponseEntity.ok(sch);
	}
	
	//Tra cuu lich lam viec theo ngay
	@GetMapping("/schedule/time")
	public List<Schedule> getScheduleByDate(@RequestParam("s") Date date1,@RequestParam("e") Date date2){
//		List<Schedule> sch = schRepository.findScheByDate(date1, date2);
		List<Schedule> sch = schRepository.findScheduleByDateBetween(date1, date2);
		
		return sch;
		
	}
	
	@PostMapping("/schedule") //OK
	public Schedule createSch(@RequestBody Schedule sch) {
		return schRepository.save(sch);
	}
	
	@PutMapping("/schedule/{id}") //OK
	public ResponseEntity<Schedule> updateSch(@PathVariable String id, @RequestBody Schedule schDetails) {
		Schedule sch = schRepository.findSchById(id);
//		sch.setsWor(schDetails.getDate());
		sch.setsShi(schDetails.getsShi());
		sch.setListDoctor(schDetails.getListDoctor());
		Schedule updatedSch = schRepository.save(sch);
		return ResponseEntity.ok(updatedSch);
	}
}
