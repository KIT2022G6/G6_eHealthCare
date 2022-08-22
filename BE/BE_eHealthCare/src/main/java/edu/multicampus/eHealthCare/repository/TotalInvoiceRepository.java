package edu.multicampus.eHealthCare.repository;

import edu.multicampus.eHealthCare.model.TotalInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TotalInvoiceRepository extends JpaRepository<TotalInvoice, Long> {
    @Query(value = "SELECT * FROM total_invoice WHERE invoiceid =?",
            nativeQuery = true)
    public TotalInvoice findTotalInvoiceById(String invoiceID);
}
