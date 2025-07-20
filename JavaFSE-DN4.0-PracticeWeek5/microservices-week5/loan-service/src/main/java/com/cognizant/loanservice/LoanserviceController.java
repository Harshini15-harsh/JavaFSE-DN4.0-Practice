package com.cognizant.loanservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanserviceController {

    @GetMapping("/loan")
    public String getLoanDetails() {
        return "Loan Details from Loan Service";
    }
}
