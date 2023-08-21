package com.sapdiscountapp.calculatediscount.service;

import com.sapdiscountapp.calculatediscount.dto.DiscountDto;
import com.sapdiscountapp.calculatediscount.model.*;
import com.sapdiscountapp.calculatediscount.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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


    public List<DiscountDto> generateDiscount(int customerCode) {

        Customers customer = customerRepo.findById(customerCode).get();
        List<Invoice> invoiceList = invoiceRepo.findByCustomerCode(customerCode);

        List<DiscountDto> discountDtoList = new ArrayList<>();


        invoiceList.forEach(invoice -> {
            List<Integer> discounts = new ArrayList<>();
            discounts.add(0);
            int setOfDate = getDateFromDate(invoice.getInvoiceSetOff());

            TimeSlots timeSlots = timeSlotRepo.findBySetOffDate(setOfDate);

            List<Integer> invoiceDetail = invoiceDetailRepo.findByInvoice(invoice);

            invoiceDetail.forEach(invoicerow -> {
              MaterialGroup materialGroup = invoiceDetailRepo.getMaterialId(invoicerow);
            //  Optional<MaterialGroup> materialGroup = materialGroupRepo.findById(materialGroupId);
              Integer quantity = invoiceDetailRepo.getQuantityById(invoicerow);
              SchemaDetail schemaDetail =  schemaDetailRepo.findByTimeSlotsAndMaterialGroup(timeSlots,materialGroup);
              int discount = discounts.get(0) + quantity * (schemaDetail!=null?schemaDetail.getValue():0) ;
              discounts.set(0, discount);

            });



            DiscountDto discountDto = new DiscountDto();
            discountDto.setCustomerCode(customer.getCustomerCode());
            discountDto.setCustomerName(customer.getCustomerName());
            discountDto.setDiscount(discounts.get(0));
            discountDto.setInvoiceNumber(invoice.getInvNumber());
            discountDtoList.add(discountDto);
        });

        return  discountDtoList;

    }

    private int getDateFromDate(Date date) {


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int datenumber = calendar.get(Calendar.DATE);
        return datenumber;

    }


}
