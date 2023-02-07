package com.socialmedia.app.service;

import com.socialmedia.app.entity.Login;
import com.socialmedia.app.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public String save(Login login){

        login.setAndEncryptPassword(login.getPassword());
        loginRepository.saveAndFlush(login);
        return "success";
    }
}
