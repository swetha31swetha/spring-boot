package com.companys.companys.service;

import com.companys.companys.entity.FoodCompany;
import com.companys.companys.repository.FoodCompanyRepository;
import com.companys.companys.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoodCompanyService {
    @Autowired
    private FoodCompanyRepository foodRepository;
    @Autowired
    private ProductsRepository productsRepository;
    public String save(FoodCompany food){
        foodRepository.saveAndFlush(food);
        return "ok";
    }
    public FoodCompany save(List<FoodCompany> obj1){
        List<FoodCompany>obj2=new ArrayList<>();
        FoodCompany obj3=null;
        for(FoodCompany obj4:obj1){
            obj3=new FoodCompany();
            foodRepository.saveAndFlush(obj4);
        }
        return obj3;

    }
    public List<FoodCompany> getAll() {
        return foodRepository.findAll();
    }

    public Optional<FoodCompany> getById(int id) {
        return foodRepository.findById(id);

    }

    public String update(FoodCompany country) {
        foodRepository.saveAndFlush(country);
        return "update";
    }

    public void delete(int id) {
        foodRepository.deleteById(id);

    }
}

