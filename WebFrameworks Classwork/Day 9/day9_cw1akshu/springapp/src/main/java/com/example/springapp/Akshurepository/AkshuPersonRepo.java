package com.example.springapp.Akshurepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.Akshumodel.AkshuPerson;


public interface AkshuPersonRepo extends JpaRepository<AkshuPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<AkshuPerson> findByAge(int age);
}
