package com.social.media.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.social.media.app.entity.Cat;
import com.social.media.app.service.CatService;


@RestController
public class CatController {
	@Autowired
    private CatService catservice;
    @PostMapping("/post")
    private String save(@RequestBody Cat cat){
        catservice.save(cat);
        return "okk";
    }
    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List< Cat> obj1) {
        Cat obj2 = catservice.save(obj1);
        return "listAll";
    }

    @GetMapping("/get")
    private List< Cat> getAll() {
        return catservice.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional< Cat> getId(@PathVariable("id") int id) {
        return catservice.getById(id);

    }

    @PutMapping("/update")
    private String update(@RequestBody  Cat country) {
    	catservice.update(country);
        return "update";
    }

    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {
    	catservice.delete(id);
    }

}
