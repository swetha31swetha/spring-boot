package com.county.county.service;

import com.county.county.entity.Country;
import com.county.county.repository.City1Repository;
import com.county.county.repository.City2Repository;
import com.county.county.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private City1Repository city1Repository;
    @Autowired
    private City2Repository city2Repository;
    public String save(Country country){
        countryRepository.saveAndFlush(country);
        return "ok";
    }
    public Country save(List<Country> obj1) {
        List<Country> obj2 = new ArrayList<>();
        Country obj3 = null;
        for (Country obj4 : obj1) {
            obj3 = new Country();
            countryRepository.saveAndFlush(obj4);
        }
        return obj3;


    }

    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    public Optional<Country> getById(int id) {
        return countryRepository.findById(id);

    }

    public String update(Country country) {
        countryRepository.saveAndFlush(country);
        return "update";
    }

    public void delete(int id) {
        countryRepository.deleteById(id);

    }
}


