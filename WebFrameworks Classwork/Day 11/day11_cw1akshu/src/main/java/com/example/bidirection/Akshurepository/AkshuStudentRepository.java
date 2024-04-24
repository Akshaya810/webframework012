package com.example.bidirection.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.Akshumodel.AkshuStudent;



@Repository
public interface AkshuStudentRepository extends JpaRepository<AkshuStudent,Integer>{
    
}
