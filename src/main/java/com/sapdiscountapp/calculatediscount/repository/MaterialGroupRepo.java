package com.sapdiscountapp.calculatediscount.repository;

import com.sapdiscountapp.calculatediscount.model.MaterialGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialGroupRepo extends JpaRepository<MaterialGroup, Integer> {
}
