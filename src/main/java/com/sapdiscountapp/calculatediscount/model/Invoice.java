package com.sapdiscountapp.calculatediscount.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Invoice {

    @Id
    private int inv_number;

    @ManyToOne
    @JoinColumn(name = "customer_code", referencedColumnName = "customer_code")
    private Customers customers;

    private String invoice_set_on;
    private String invoice_set_off;

    public int getInv_number() {
        return inv_number;
    }

    public Customers getCustomers() {
        return customers;
    }

    public String getInvoice_set_on() {
        return invoice_set_on;
    }

    public String getInvoice_set_off() {
        return invoice_set_off;
    }
}
