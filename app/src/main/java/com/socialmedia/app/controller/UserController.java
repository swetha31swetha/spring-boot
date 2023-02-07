package com.socialmedia.app.controller;


import com.socialmedia.app.dto.UserDTO;
import com.socialmedia.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired  UserService userService;
    @GetMapping("/user")
    public ArrayList<UserDTO> getAllUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{user_id}")
    public UserDTO getUserById(@PathVariable("user_id") Integer user_id){
        return userService.getUserByID(user_id);
    }

    @PostMapping("/user")
    public UserDTO createUser(@RequestBody UserDTO userDTO){
        return userService.createUser(userDTO);
    }

    @PutMapping("/user/{user_id}")
    public UserDTO updateUser(@PathVariable("user_id") Integer user_id, @RequestBody UserDTO userDTO){
        return userService.updateUser(user_id, userDTO);
    }

    @DeleteMapping ("/user/{user_id}")
    public void deleteUser(@PathVariable("user_id") Integer user_id){
        userService.deleteUser(user_id);
    }
}
