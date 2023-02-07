package com.user.user.repository;

import com.user.user.entity.Prodect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdectRepository extends JpaRepository<Prodect,Integer> {
}
