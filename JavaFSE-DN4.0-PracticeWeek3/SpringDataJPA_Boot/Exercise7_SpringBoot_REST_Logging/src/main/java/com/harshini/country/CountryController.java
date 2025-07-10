package com.harshini.country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryRepository repo;

    @GetMapping
    public ResponseEntity<List<Country>> getAll() {
        logger.info("Fetching all countries");
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getById(@PathVariable Long id) {
        logger.info("Fetching country with ID: {}", id);
        Optional<Country> country = repo.findById(id);
        return country.map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Country> create(@RequestBody Country country) {
        logger.info("Creating country: {}", country.getName());
        Country saved = repo.save(country);
        return ResponseEntity.status(201).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Country> update(@PathVariable Long id, @RequestBody Country updatedCountry) {
        return repo.findById(id).map(country -> {
            country.setName(updatedCountry.getName());
            country.setCapital(updatedCountry.getCapital());
            repo.save(country);
            logger.info("Updated country with ID: {}", id);
            return ResponseEntity.ok(country);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            logger.warn("Deleted country with ID: {}", id);
            return ResponseEntity.noContent().build();
        } else {
            logger.error("Country with ID {} not found", id);
            return ResponseEntity.notFound().build();
        }
    }
}
