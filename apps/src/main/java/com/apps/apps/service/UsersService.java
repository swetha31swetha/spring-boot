package com.apps.apps.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.apps.dto.UsersDto;
import com.apps.apps.entity.Users;
import com.apps.apps.repository.UsersRepository;

@Service
public class UsersService {
	 @Autowired
	    private UsersRepository UsersRepository;

	    private ModelMapper modelMapper = new ModelMapper();

//	    public UserDTO convertUserDAOToDTO(Optional<UserDAO> userDAO){
//	        return modelMapper.map(userDAO, UserDTO.class);
//	    }

	    public Users convertUserDTOToEntity(UsersDto userDTO){
	        return modelMapper.map(userDTO, Users.class);
	    }

	    public ArrayList<UsersDto> getAllUsers(){
	        List<Users> users =  UsersRepository.findAll();
	        ArrayList<UsersDto> userDTOS = new ArrayList<UsersDto>();
	        for (Users user: users) {
	
	            userDTOS.add(modelMapper.map(user, UsersDto.class));

	        }
	        return userDTOS;
	    }

	    public UsersDto getUserByID(Integer user_id){
	        Optional<Users> userDAO = UsersRepository.findById(user_id);
	       
	        return modelMapper.map(userDAO.get(), UsersDto.class);
	    }

	    public UsersDto createUser(UsersDto usersDto){
	        Users user = this.convertUserDTOToEntity(usersDto);
	        user = UsersRepository.save(user);
	      
	        return modelMapper.map(user, UsersDto.class);
	    }

	    public UsersDto updateUser(Integer user_id, UsersDto userDTO){
	        Users user = this.convertUserDTOToEntity(userDTO);
	        user.setId(user_id);
	        user = UsersRepository.save(user);
	   
	        return modelMapper.map(user, UsersDto.class);
	    }

	    public void deleteUser(Integer user_id){
	        UsersRepository.deleteById(user_id);
	    }
	}


