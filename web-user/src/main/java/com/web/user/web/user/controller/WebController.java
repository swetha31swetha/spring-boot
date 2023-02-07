package com.web.user.web.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.user.web.user.entity.WebUser;
import com.web.user.web.user.service.WebService;

import java.util.List;
import java.util.Optional;

@RestController
public class WebController {
	@Autowired
    private WebService webservice;
    @PostMapping("/post")
    private String save(@RequestBody WebUser webuser){
    	webservice.save(webuser);
        return "okk";
    }
    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List< WebUser> obj1) {
        WebUser obj2 = webservice.save(obj1);
        return "listAll";
    }

    @GetMapping("/get")
    private List< WebUser> getAll() {
        return webservice.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional< WebUser> getId(@PathVariable("id") int id) {
        return webservice.getById(id);

    }

    @PutMapping("/update")
    private String update(@RequestBody  WebUser country) {
        webservice.update(country);
        return "update";
    }

    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {
        webservice.delete(id);
    }

}


