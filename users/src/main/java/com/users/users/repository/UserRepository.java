package com.users.users.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.users.users.dto.UserDTO;
import com.users.users.entity.User;
import com.users.users.swaggerconfig.WriteableRepository;


@Repository
public interface UserRepository extends WriteableRepository<User,UUID>{

	void saveAndFlush(UserDTO user);

	

	Optional<User> findByUserName(String userName);

	


}
