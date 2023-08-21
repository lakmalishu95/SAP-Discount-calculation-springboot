package com.sapdiscountapp.calculatediscount.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "Invoice_Details")
public class InvoiceDetail {

    @Column(name = "id")
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "invoice_number", referencedColumnName = "inv_number")
    private Invoice invoice;

    @Column(name = "material")
    private int material;
    @Column(name = "material_name")
    private String materialName;

    @ManyToOne
    @JoinColumn(name = "material_group", referencedColumnName = "group_name")
    private MaterialGroup materialGroup ;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "value")
    private int value;


}
