package com.phone.phone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phone.phone.entity.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone,Integer>{

}
