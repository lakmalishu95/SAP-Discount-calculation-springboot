package com.sapdiscountapp.calculatediscount.model;

import com.sapdiscountapp.calculatediscount.repository.MaterialGroupRepo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Schema_Detail")
public class SchemaDetail {

    @Id
    @Column(name = "schema_id")
    private int schemaId;
    @Column(name = "value")
    private int value;

    @ManyToOne
    @JoinColumn(name = "time_slots", referencedColumnName = "id")
    private TimeSlots timeSlots;

    @ManyToOne
    @JoinColumn(name = "material_group", referencedColumnName="group_id")
    private MaterialGroup materialGroup;



}
