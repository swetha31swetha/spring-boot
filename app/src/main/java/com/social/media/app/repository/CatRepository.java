package com.social.media.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.media.app.entity.Cat;

@Repository
public interface CatRepository extends JpaRepository<Cat,Integer> { 

}
