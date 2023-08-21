package com.sapdiscountapp.calculatediscount.repository;

import com.sapdiscountapp.calculatediscount.model.Invoice;
import com.sapdiscountapp.calculatediscount.model.InvoiceDetail;
import com.sapdiscountapp.calculatediscount.model.MaterialGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceDetailRepo extends JpaRepository<InvoiceDetail, Integer> {

    @Query("SELECT id FROM InvoiceDetail WHERE invoice=?1")
    List<Integer> findByInvoice(Invoice invoice);

    @Query("SELECT materialGroup FROM InvoiceDetail WHERE id = ?1 ")
    MaterialGroup getMaterialId(Integer invoicerow);

    @Query("SELECT quantity FROM InvoiceDetail WHERE id = ?1 ")
    Integer getQuantityById(Integer invoicerow);
}
