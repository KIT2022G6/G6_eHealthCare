package edu.multicampus.eHealthCare.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.multicampus.eHealthCare.model.MedicalRecord;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long>{
//	MedicalRecord getRecordByIdAndDate(String recordID, Date date);
@Query(value = "select  * from medical_record",
        nativeQuery = true)
List<MedicalRecord> queryBy(@Param("phone") String phone,
                            @Param("authors") List<String> authors);
}
