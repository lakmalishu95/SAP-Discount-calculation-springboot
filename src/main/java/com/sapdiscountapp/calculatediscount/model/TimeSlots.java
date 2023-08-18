package com.sapdiscountapp.calculatediscount.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimeSlots {

    @Id
    private int id;
    private int from;
    private int to;

    public int getId() {
        return id;
    }
    public int getFrom() {
        return from;
    }
    public int getTo() {
        return to;
    }

}
