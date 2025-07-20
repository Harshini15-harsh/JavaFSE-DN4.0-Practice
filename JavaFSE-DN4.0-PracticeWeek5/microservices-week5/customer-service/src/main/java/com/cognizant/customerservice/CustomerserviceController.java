package com.cognizant.customerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerserviceController {

    @GetMapping("/customer")
    public String getCustomerDetails() {
        return "Customer Details from Customer Service";
    }
}