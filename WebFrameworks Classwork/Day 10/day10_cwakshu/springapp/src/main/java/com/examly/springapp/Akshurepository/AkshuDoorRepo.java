package com.examly.springapp.Akshurepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Akshumodel.AkshuDoor;

// import jakarta.transaction.Transactiona

@Repository
public interface AkshuDoorRepo extends JpaRepository<AkshuDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<AkshuDoor> findByColor(String color);

    public List<AkshuDoor> findByDoorType(String doortype);
}
