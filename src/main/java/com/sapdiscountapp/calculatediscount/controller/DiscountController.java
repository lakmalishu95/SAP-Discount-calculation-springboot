package com.sapdiscountapp.calculatediscount.controller;


import com.sapdiscountapp.calculatediscount.dto.DiscountDto;
import com.sapdiscountapp.calculatediscount.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class DiscountController {

    @Autowired
    DiscountService discountService;

    @GetMapping("/discount/{code}")
    public List<DiscountDto> getDiscountsByCustomer(@PathVariable("code") int customerCode) {
        return discountService.generateDiscount(customerCode);
    }
}
