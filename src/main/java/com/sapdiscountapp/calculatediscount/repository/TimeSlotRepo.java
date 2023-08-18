package com.sapdiscountapp.calculatediscount.repository;

import com.sapdiscountapp.calculatediscount.model.TimeSlots;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeSlotRepo extends JpaRepository<TimeSlots, Integer> {
}
