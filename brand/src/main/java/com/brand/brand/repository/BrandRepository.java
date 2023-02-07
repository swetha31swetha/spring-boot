package com.brand.brand.repository;

import com.brand.brand.entity.brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<brand,Integer> {
}
