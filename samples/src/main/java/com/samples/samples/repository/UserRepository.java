package com.samples.samples.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.samples.samples.config.WriteableRepository;
import com.samples.samples.dto.UserDto;
import com.samples.samples.entity.User;

@Repository
public interface UserRepository extends WriteableRepository<User,UUID>{

	void saveAndFlush(UserDto user);

	

	Optional<User> findByUserName(String userName);

	
}
