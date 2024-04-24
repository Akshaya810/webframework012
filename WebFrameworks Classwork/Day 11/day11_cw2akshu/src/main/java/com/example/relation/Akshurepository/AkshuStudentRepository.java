package com.example.relation.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.Akshumodel.AkshuStudent;

@Repository
public interface AkshuStudentRepository extends JpaRepository<AkshuStudent,Integer>{
    
}
