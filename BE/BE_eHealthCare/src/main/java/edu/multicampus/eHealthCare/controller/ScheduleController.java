package edu.multicampus.eHealthCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.multicampus.eHealthCare.model.Schedule;
import edu.multicampus.eHealthCare.repository.ScheduleRepository;

@RestController
@RequestMapping("/api/v1/")
public class ScheduleController {
	@Autowired
	private ScheduleRepository schRepository;

	@GetMapping("/schedule")
	public List<Schedule> getAllSchedule() {
		return schRepository.findAll();
	}

	@GetMapping("/schedule/{id}")
	public ResponseEntity<Schedule> getScheduleById(@PathVariable String id) {
		Schedule sch = schRepository.findSchById(id);

		return ResponseEntity.ok(sch);
	}

}
