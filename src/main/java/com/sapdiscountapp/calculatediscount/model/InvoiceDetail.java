package com.sapdiscountapp.calculatediscount.model;

import javax.persistence.*;

@Entity
public class InvoiceDetail {

    @ManyToOne
    @JoinColumn(name = "invoice_number", referencedColumnName = "inv_number")
    private Invoice invoice;
    private int material;
    private String material_name;

    @ManyToOne
    @JoinColumn(name = "material_group", referencedColumnName = "group_name")
    private MaterialGroup materialGroup ;

    private int quantity;
    private int value;

    public Invoice getInvoice() {
        return invoice;
    }

    public int getMaterial() {
        return material;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public MaterialGroup getMaterialGroup() {
        return materialGroup;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getValue() {
        return value;
    }
}
