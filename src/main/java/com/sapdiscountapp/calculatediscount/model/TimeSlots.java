package com.sapdiscountapp.calculatediscount.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Table(name = "Time_Slots")
public class TimeSlots {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "start_from")
    private int from;
    @Column(name = "end_to")
    private int to;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
}
