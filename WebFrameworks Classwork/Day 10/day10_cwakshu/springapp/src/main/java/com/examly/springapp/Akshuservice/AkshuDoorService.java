package com.examly.springapp.Akshuservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Akshumodel.AkshuDoor;
import com.examly.springapp.Akshurepository.AkshuDoorRepo;

@Service
public class AkshuDoorService {
    @Autowired
    private AkshuDoorRepo doorRepo;

    public AkshuDoor postData(AkshuDoor door) {
        return doorRepo.save(door);
    }

    public List<AkshuDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public AkshuDoor updateDetail(int doorid, AkshuDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<AkshuDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<AkshuDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public AkshuDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}