package com.harshini.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository repo;

    @GetMapping
    public List<Country> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Country getById(@PathVariable Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new CountryNotFoundException("Country not found with id " + id));
    }
}
