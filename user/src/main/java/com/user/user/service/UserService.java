package com.user.user.service;

import com.user.user.entity.Prodect;
import com.user.user.repository.CustomerRepository;
import com.user.user.repository.ProdectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private ProdectRepository repository;
    @Autowired
    private CustomerRepository customerRepository;
    public String save(Prodect prodect){
        repository.saveAndFlush(prodect);
        return "product";

    }
}
