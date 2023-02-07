package com.brand.brand.service;

import com.brand.brand.entity.Laptop;
import com.brand.brand.repository.BrandRepository;
import com.brand.brand.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;
    @Autowired
    private BrandRepository brandRepository;
    public String save(Laptop laptop){
        laptopRepository.saveAndFlush(laptop);
        return "laptop";
    }
    public Laptop save(List<Laptop> obj1){
        List<Laptop>obj2=new ArrayList<>();
        Laptop obj3=null;
        for(Laptop obj4:obj1) {
            obj3 = new Laptop();
            laptopRepository.saveAndFlush(obj4);
        }
        return obj3;


    }

    public List<Laptop> getAll() {
        return laptopRepository.findAll();
    }

    public Optional<Laptop> getById(int id) {
        return laptopRepository.findById(id);

    }

    public String update(Laptop laptop) {
        laptopRepository.saveAndFlush(laptop);
        return"update";
    }

    public void delete(int id) {
        laptopRepository.deleteById(id);

    }
}
