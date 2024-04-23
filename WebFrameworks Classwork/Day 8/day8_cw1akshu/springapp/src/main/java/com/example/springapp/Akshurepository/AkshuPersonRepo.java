package com.example.springapp.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Akshumodel.AkshuPerson;

import java.util.List;


@Repository
public interface AkshuPersonRepo extends JpaRepository<AkshuPerson,Integer>{

    List<AkshuPerson> findByNameStartingWith(String name);
    List<AkshuPerson> findByNameEndingWith(String name);
    
}
