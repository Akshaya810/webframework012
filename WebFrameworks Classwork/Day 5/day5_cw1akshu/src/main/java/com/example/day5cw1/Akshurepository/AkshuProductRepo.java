package com.example.day5cw1.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.Akshumodel.AkshuProduct;

@Repository
public interface AkshuProductRepo extends JpaRepository<AkshuProduct,Integer>{
    
}
