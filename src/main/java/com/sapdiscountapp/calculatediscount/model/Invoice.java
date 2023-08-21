package com.sapdiscountapp.calculatediscount.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Invoice")
public class Invoice {

    @Id
    @Column(name = "inv_number")
    private int invNumber;
    @Column(name = "customer_code")
    private int customerCode;
    @ManyToOne
    @JoinColumn(name = "customer_code", referencedColumnName = "customer_code",insertable = false, updatable = false)
    private Customers customers;
    @Column(name = "invoice_date")
    private Date invoiceSetOn;
    @Column(name = "invoice_setoff_date")
    private Date invoiceSetOff;


}
