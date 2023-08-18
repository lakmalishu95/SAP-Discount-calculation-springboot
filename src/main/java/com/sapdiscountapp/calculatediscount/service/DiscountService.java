package com.sapdiscountapp.calculatediscount.service;

import com.sapdiscountapp.calculatediscount.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    InvoiceRepo invoiceRepo;

    @Autowired
    InvoiceDetailRepo invoiceDetailRepo;

    @Autowired
    MaterialGroupRepo materialGroupRepo;

    @Autowired
    SchemaDetailRepo schemaDetailRepo;

    @Autowired
    TimeSlotRepo timeSlotRepo;



}
