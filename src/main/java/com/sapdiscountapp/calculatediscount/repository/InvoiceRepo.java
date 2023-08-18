package com.sapdiscountapp.calculatediscount.repository;

import com.sapdiscountapp.calculatediscount.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepo extends JpaRepository<Invoice, Integer> {
}
