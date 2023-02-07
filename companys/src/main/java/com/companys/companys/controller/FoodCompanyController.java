package com.companys.companys.controller;

import com.companys.companys.entity.FoodCompany;
import com.companys.companys.service.FoodCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FoodCompanyController {
    @Autowired
    private FoodCompanyService foodService;
    @PostMapping("/post")
    private String save(@RequestBody FoodCompany food){
        foodService.save(food);
        return "okk";
    }
    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List<FoodCompany> obj1) {
        FoodCompany obj2 = foodService.save(obj1);
        return "listAll";
    }

    @GetMapping("/get")
    private List<FoodCompany> getAll() {
        return foodService.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional<FoodCompany> getId(@PathVariable("id") int id) {
        return foodService.getById(id);

    }

    @PutMapping("/update")
    private String update(@RequestBody FoodCompany country) {
        foodService.update(country);
        return "update";
    }

    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {
        foodService.delete(id);
    }

}








