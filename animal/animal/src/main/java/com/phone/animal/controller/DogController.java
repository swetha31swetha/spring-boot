package com.phone.animal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phone.animal.entity.Dog;
import com.phone.animal.service.DogService;

@RestController
public class DogController {
	@Autowired
	private DogService service;
	
	@PostMapping("/post")
	private void save(@RequestBody Dog dog) {
		service.save(dog);
	}

}
