package com.harshini.country;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Country name is required")
    @Size(min = 2, max = 50, message = "Country name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Capital is required")
    @Size(min = 2, max = 50, message = "Capital must be between 2 and 50 characters")
    private String capital;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCapital() { return capital; }
    public void setCapital(String capital) { this.capital = capital; }
}
