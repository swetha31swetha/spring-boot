package com.phone.animal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phone.animal.entity.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {

}
