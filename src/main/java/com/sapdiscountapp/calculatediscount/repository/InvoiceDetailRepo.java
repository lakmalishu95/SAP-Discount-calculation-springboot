package com.sapdiscountapp.calculatediscount.repository;

import com.sapdiscountapp.calculatediscount.model.InvoiceDetail;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface InvoiceDetailRepo  {
    @Query(value = "SELECT * FROM invoice_detail", nativeQuery = true)
    List<InvoiceDetail> findByCustomConditions();



}
