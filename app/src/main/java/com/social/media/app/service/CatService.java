package com.social.media.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.media.app.entity.Cat;
import com.social.media.app.repository.CatRepository;

@Service
public class CatService {
	 @Autowired
	    private CatRepository catrepository;
	    public String save(Cat cat){
	        catrepository.saveAndFlush(cat);
	        return "ok";
	    }
	    public Cat save(List<Cat> obj1){
	        List<Cat>obj2=new ArrayList<>();
	        Cat obj3=null;
	        for(Cat obj4:obj1){
	            obj3=new Cat();
	            catrepository.saveAndFlush(obj4);
	        }
	        return obj3;

	    }
	    public List<Cat> getAll() {
	        return catrepository.findAll();
	    }

	    public Optional<Cat> getById(int id) {
	        return catrepository.findById(id);

	    }

	    public String update(Cat country) {
	        catrepository.saveAndFlush(country);
	        return "update";
	    }

	    public void delete(int id) {
	    	catrepository.deleteById(id);

	    }

}
