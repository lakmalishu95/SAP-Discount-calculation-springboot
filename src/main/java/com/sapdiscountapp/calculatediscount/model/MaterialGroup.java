package com.sapdiscountapp.calculatediscount.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MaterialGroup {

    @Id
    private int group_id;
    private String group_name;

    public int getGroup_id() {
        return group_id;
    }

    public String getGroup_name() {
        return group_name;
    }
}
