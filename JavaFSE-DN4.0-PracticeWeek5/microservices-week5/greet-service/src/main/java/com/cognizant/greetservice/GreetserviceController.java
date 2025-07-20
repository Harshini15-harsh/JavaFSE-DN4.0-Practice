package com.cognizant.greetservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetserviceController {

    @GetMapping("/greet")
    public Object get() {
        return "Hello World";
    }
}
