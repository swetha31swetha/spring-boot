package com.apps.apps.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apps.apps.dto.UsersDto;
import com.apps.apps.service.UsersService;

@RestController
public class UsersController {
	 @Autowired  UsersService userService;
	    @GetMapping("/user")
	    public ArrayList<UsersDto> getAllUser(){
	        return userService.getAllUsers();
	    }

	    @GetMapping("/user/{user_id}")
	    public UsersDto getUserById(@PathVariable("user_id") Integer user_id){
	        return userService.getUserByID(user_id);
	    }

	    @PostMapping("/user")
	    public UsersDto createUser(@RequestBody UsersDto userDTO){
	        return userService.createUser(userDTO);
	    }

	    @PutMapping("/user/{user_id}")
	    public UsersDto updateUser(@PathVariable("user_id") Integer user_id, @RequestBody UsersDto userDTO){
	        return userService.updateUser(user_id, userDTO);
	    }

	    @DeleteMapping ("/user/{user_id}")
	    public void deleteUser(@PathVariable("user_id") Integer user_id){
	        userService.deleteUser(user_id);
	    }
}
