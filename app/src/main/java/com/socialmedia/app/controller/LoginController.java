package com.socialmedia.app.controller;


import com.socialmedia.app.entity.Login;
import com.socialmedia.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
