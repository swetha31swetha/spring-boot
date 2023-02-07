package com.phone.phone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phone.phone.entity.Phone;
import com.phone.phone.service.PhoneService;

@RestController
public class PhoneController {
	@Autowired
	private PhoneService phoneservice;
	@PostMapping("/post")
	private String save(@RequestBody Phone phone) {
		phoneservice.save(phone);
		return"phone";
		
	}
	 @PostMapping("/ListAll")
	    private String ListAll(@RequestBody List<Phone> obj1) {
		 Phone obj2 = phoneservice.save(obj1);
	        return "listAll";
	    }

	    @GetMapping("/get")
	    private List< Phone> getAll() {
	        return phoneservice.getAll();
	    }

	    @GetMapping("/get/{id}")
	    private Optional< Phone> getId(@PathVariable("id") int id) {
	        return phoneservice.getById(id);

	    }

	    @PutMapping("/update")
	    private String update(@RequestBody  Phone country) {
	    	phoneservice.update(country);
	        return "update";
	    }

	    @DeleteMapping("/delete/{id}")
	    private void deleteId(@PathVariable("id") int id) {
	    	phoneservice.delete(id);
	    }


}
