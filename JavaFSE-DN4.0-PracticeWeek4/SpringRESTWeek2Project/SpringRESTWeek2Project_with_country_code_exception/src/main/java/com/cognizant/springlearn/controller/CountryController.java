package com.cognizant.springlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private CountryService countryService;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        return (Country) context.getBean("in");
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return (List<Country>) context.getBean("countryList");
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        return countryService.getCountry(code);
    }
}
