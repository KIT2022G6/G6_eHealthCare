package edu.multicampus.eHealthCare.repository;

import edu.multicampus.eHealthCare.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    @Query(value = "SELECT * FROM medicine WHERE medicineid =?",
            nativeQuery = true)
    public Medicine findMedicineById(String medicineID);
}
