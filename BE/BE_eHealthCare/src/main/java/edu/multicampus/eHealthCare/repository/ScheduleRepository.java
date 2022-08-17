package edu.multicampus.eHealthCare.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.multicampus.eHealthCare.model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
	@Query(value = "SELECT * FROM schedule WHERE scheduleid =?", nativeQuery = true)
	public Schedule findSchById(String schID);

	@Query(value = "SELECT * FROM schedule WHERE s_wor >? AND s_wor <?", nativeQuery = true)
	public List<Schedule> findScheByDate(Date date1, Date date2);
	
	 List<Schedule> findScheduleByDateBetween(Date date1, Date date2);
}
