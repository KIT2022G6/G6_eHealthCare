package edu.multicampus.eHealthCare.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import edu.multicampus.eHealthCare.model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
	Schedule findSchByScheduleID(String schID);

//	@Query(value = "SELECT * FROM schedule WHERE s_wor >? AND s_wor <?", nativeQuery = true)
//	public List<Schedule> findScheByDate(Date date1, Date date2);

	List<Schedule> findScheduleBySchDateBetween(Date date1, Date date2);

	@Query(value = "SELECT sch.id, sch.sch_date, sch.scheduleid, sch.sch_shift, doc.doctorid, doc.d_name, doc.d_age, doc.d_phone, doc.d_email FROM schedule1 sch, doctor doc WHERE sch.scheduleid = doc.fk_scheduleid AND sch.sch_date = ?;", nativeQuery = true)
	List<Schedule> findAllDoctorBySchDate(Date vDate);
}
