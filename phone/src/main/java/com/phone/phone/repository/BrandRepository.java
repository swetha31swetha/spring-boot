package com.phone.phone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phone.phone.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer>{

}
