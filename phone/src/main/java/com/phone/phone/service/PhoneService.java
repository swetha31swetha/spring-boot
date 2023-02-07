package com.phone.phone.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phone.phone.entity.Phone;
import com.phone.phone.repository.BrandRepository;
import com.phone.phone.repository.PhoneRepository;


@Service
public class PhoneService {
	@Autowired
	private PhoneRepository phonerepository;
	@Autowired
	private BrandRepository brandrepository;
	public String save(Phone phone) {
		phonerepository.saveAndFlush(phone);
		return"phone";
	}
	 public Phone save(List<Phone> obj1){
	        List<Phone>obj2=new ArrayList<>();
	       Phone obj3=null;
	        for(Phone obj4:obj1){
	            obj3=new Phone();
	            phonerepository.saveAndFlush(obj4);
	        }
	        return obj3;

	    }
	    public List<Phone> getAll() {
	        return  phonerepository.findAll();
	    }

	    public Optional<Phone> getById(int id) {
	        return  phonerepository.findById(id);

	    }

	    public String update(Phone country) {
	    	 phonerepository.saveAndFlush(country);
	        return "update";
	    }

	    public void delete(int id) {
	    	 phonerepository.deleteById(id);

	    }
}
