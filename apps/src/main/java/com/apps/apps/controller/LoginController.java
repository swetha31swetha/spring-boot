package com.apps.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apps.apps.entity.Login;
import com.apps.apps.service.LoginService;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/saveLogin")
    private String saveLogin(@RequestBody Login login){
        loginService.save(login);
        return "student save successfully";
    }


}
