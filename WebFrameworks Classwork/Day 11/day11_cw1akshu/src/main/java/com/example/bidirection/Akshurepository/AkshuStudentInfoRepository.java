package com.example.bidirection.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.Akshumodel.AkshuStudentInfo;

@Repository
public interface AkshuStudentInfoRepository extends JpaRepository<AkshuStudentInfo,Integer>{
    
}