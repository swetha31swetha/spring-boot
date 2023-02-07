package com.company.company.controller;

import com.company.company.CompanyApplication;
import com.company.company.entity.Company;
import com.company.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/post")
    private String save(@RequestBody Company company) {
        companyService.save(company);
        return "employee";
    }

    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List<Company> obj1) {
        Company obj2 = companyService.save(obj1);
        return "listAll";
    }

    @GetMapping("/get")
    private List<Company> getAll() {
        return companyService.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional<Company> getId(@PathVariable("id") int id) {
        return companyService.getById(id);

    }

    @PutMapping("/update")
    private String update(@RequestBody Company company) {
        companyService.update(company);
        return "update";
    }

    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {
        companyService.delete(id);
    }

}




