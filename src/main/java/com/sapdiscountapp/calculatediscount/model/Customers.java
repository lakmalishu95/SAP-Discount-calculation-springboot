package com.sapdiscountapp.calculatediscount.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {

    @Id
    private int customer_code;
    private String customer_name;
    private String customer_group;

    public int getCustomer_code() {
        return customer_code;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCustomer_group() {
        return customer_group;
    }
}
