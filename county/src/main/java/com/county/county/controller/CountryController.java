package com.county.county.controller;

import com.county.county.entity.Country;
import com.county.county.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;
    @PostMapping("/post")
    private String save(@RequestBody Country country){
        countryService.save(country);
        return "okk";
    }
    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List<Country> obj1) {
       Country obj2 = countryService.save(obj1);
        return "listAll";
    }

    @GetMapping("/get")
    private List<Country> getAll() {
        return countryService.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional<Country> getId(@PathVariable("id") int id) {
        return countryService.getById(id);

    }

    @PutMapping("/update")
    private String update(@RequestBody Country country) {
        countryService.update(country);
        return "update";
    }

    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {
        countryService.delete(id);
    }

}






