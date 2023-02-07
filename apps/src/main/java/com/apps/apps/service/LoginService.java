package com.apps.apps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.apps.entity.Login;
import com.apps.apps.repository.LoginRepository;


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

