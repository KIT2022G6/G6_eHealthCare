package edu.multicampus.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.multicampus.eHealthCare.model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long>{
	@Query(value = "SELECT * FROM schedule WHERE scheduleid =?",
			nativeQuery=true)
	public Schedule findSchById(String schID);
}
