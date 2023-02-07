package com.web.user.web.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.web.user.web.user.entity.WebUser;
import com.web.user.web.user.repository.WebRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class WebService {
	@Autowired
    private WebRepository webrepository;
    public String save(WebUser webuser){
    	webrepository.saveAndFlush(webuser);
    return "ok";
    }
     
        public String encryptPassword(String password) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            return encoder.encode(password);
        }
    public WebUser save(List<WebUser> obj1){
        List<WebUser>obj2=new ArrayList<>();
        WebUser obj3=null;
        for(WebUser obj4:obj1){
            obj3=new WebUser();
            webrepository.saveAndFlush(obj4);
        }
        return obj3;

    }
    public  List<WebUser> getAll() {
        return webrepository.findAll();
    }

    public  Optional<WebUser> getById(int id) {
        return webrepository.findById(id);

    }

    public  String update(WebUser country) {
       webrepository.saveAndFlush(country);
        return "update";
    }

    public  void delete(int id) {
       webrepository.deleteById(id);

    }

}




    