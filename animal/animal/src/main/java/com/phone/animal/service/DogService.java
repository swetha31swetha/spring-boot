package com.phone.animal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phone.animal.entity.Dog;
import com.phone.animal.repository.DogRepository;

@Service
public class DogService {
	@Autowired
	private DogRepository repository;
	
	public void save(Dog dog) {
		repository.save(dog);
	}

}
