package com.sapdiscountapp.calculatediscount.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountDto {

    private int invoiceNumber;

    private int customerCode;

    private String customerName;

    private double discount;
}
