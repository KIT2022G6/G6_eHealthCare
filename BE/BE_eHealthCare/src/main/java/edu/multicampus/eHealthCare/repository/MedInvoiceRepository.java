package edu.multicampus.eHealthCare.repository;

import edu.multicampus.eHealthCare.model.MedInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedInvoiceRepository extends JpaRepository<MedInvoice, Long> {
    @Query(value = "SELECT * FROM med_invoice WHERE med_invoiceid =?",
            nativeQuery = true)
    public MedInvoice findMedicineById(String medInvoiceID);
}
