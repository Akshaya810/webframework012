package com.example.day6cw3.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.Akshumodel.AkshuProduct;

@Repository
public interface AkshuProductRepo extends JpaRepository<AkshuProduct,Integer>{
    
}
