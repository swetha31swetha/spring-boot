package com.companys.companys.repository;

import com.companys.companys.entity.FoodCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodCompanyRepository extends JpaRepository<FoodCompany,Integer> {

  
}
