package com.web.user.web.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.user.web.user.entity.WebUser;

@Repository
public interface WebRepository extends JpaRepository<WebUser,Integer>{

	Optional<WebUser> findByUserName(String userName);
	

}
