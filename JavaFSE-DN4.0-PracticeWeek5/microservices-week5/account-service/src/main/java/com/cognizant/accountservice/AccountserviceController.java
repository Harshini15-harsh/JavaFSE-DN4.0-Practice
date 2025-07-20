package com.cognizant.accountservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountserviceController {

    @GetMapping("/account")
    public String getAccountDetails() {
        return "Account details from ACCOUNT-SERVICE";
    }
}
