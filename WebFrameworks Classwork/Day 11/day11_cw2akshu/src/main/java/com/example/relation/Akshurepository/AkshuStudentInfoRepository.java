package com.example.relation.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.Akshumodel.AkshuStudentInfo;

@Repository
public interface AkshuStudentInfoRepository extends JpaRepository<AkshuStudentInfo,Integer>{
    
}