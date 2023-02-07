package com.apps.apps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apps.apps.entity.Login;

@Repository
public interface LoginRepository  extends JpaRepository<Login, Integer> {

}
