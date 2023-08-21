package com.sapdiscountapp.calculatediscount.repository;

import com.sapdiscountapp.calculatediscount.model.MaterialGroup;
import com.sapdiscountapp.calculatediscount.model.SchemaDetail;
import com.sapdiscountapp.calculatediscount.model.TimeSlots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SchemaDetailRepo extends JpaRepository<SchemaDetail, Integer> {
    @Query("FROM SchemaDetail sd WHERE sd.timeSlots=?1 AND sd.materialGroup=?2")
    SchemaDetail findByTimeSlotsAndMaterialGroup(TimeSlots timeSlots, MaterialGroup materialGroup);
}
