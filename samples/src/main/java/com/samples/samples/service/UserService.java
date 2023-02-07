package com.samples.samples.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samples.samples.entity.User;
import com.samples.samples.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void saveOrUpdate(User userObj) {
		userRepository.saveAndFlush(userObj);

	}

	public Optional<User> findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(userName);
	}

	public Optional<User> findById(UUID id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}
	
	
	}

