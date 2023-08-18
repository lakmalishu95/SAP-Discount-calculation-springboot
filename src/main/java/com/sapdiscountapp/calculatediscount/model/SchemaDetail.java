package com.sapdiscountapp.calculatediscount.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SchemaDetail {

    @Id
    private int schema_id;
    private int value;

    @ManyToOne
    @JoinColumn(name = "time_slots", referencedColumnName = "id")
    private TimeSlots timeSlots;

    private int material_group;

    public int getSchema_id() {
        return schema_id;
    }

    public int getValue() {
        return value;
    }

    public TimeSlots getTimeSlots() {
        return timeSlots;
    }

    public int getMaterial_group() {
        return material_group;
    }
}
