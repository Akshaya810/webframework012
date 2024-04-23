package com.example.springapp.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Akshumodel.AkshuDoor;

import java.util.List;

@Repository
public interface AkshuDoorRepo extends JpaRepository<AkshuDoor,Integer>{

    List<AkshuDoor> findByDoorId(int doorId);
    List<AkshuDoor> findByAccessType(String accessType);
    
}
