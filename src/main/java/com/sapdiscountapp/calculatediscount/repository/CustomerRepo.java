package com.sapdiscountapp.calculatediscount.repository;

import com.sapdiscountapp.calculatediscount.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customers, Integer> {
}
