package com.example.day5cw2.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.Akshumodel.AkshuEmployee;


@Repository
public interface AkshuEmployeeRepo extends JpaRepository<AkshuEmployee,Integer>{
    
}
