package com.sapdiscountapp.calculatediscount.repository;

import com.sapdiscountapp.calculatediscount.model.TimeSlots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSlotRepo extends JpaRepository<TimeSlots, Integer> {
    @Query("FROM TimeSlots ts WHERE ts.from<?1 AND ts.to>?1")
    TimeSlots findBySetOffDate(int setOfDate);
}
