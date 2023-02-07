package com.user.user.controller;

import com.user.user.entity.Prodect;
import com.user.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("/post")
    private String save(@RequestBody Prodect prodect){
        service.save(prodect);
        return "product";
    }
}
