package com.brand.brand.controller;

import com.brand.brand.entity.Laptop;
import com.brand.brand.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    @Autowired
    private LaptopService laptopService;
    @PostMapping("/post")
    private String save(@RequestBody Laptop laptop){

       laptopService.save(laptop);
        return "laptop";
    }
    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List<Laptop> obj1){
        Laptop obj2=laptopService.save(obj1);
        return "listAll";
    }
    @GetMapping("/get")
    private List<Laptop>getAll(){
        return laptopService.getAll();
    }
    @GetMapping("/get/{id}")
    private Optional<Laptop>getId(@PathVariable("id")int id){
        return laptopService.getById(id);

    }
    @PutMapping("/update")
    private String update(@RequestBody Laptop laptop){
        laptopService.update(laptop);
        return "update";
    }
    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id")int id){
        laptopService.delete(id);
    }
}





































