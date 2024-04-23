package com.example.springapp.Akshuservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Akshumodel.AkshuDoor;
import com.example.springapp.Akshurepository.AkshuDoorRepo;

@Service
public class AkshuDoorService {
    @Autowired
    private AkshuDoorRepo rep;

    public boolean post(AkshuDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AkshuDoor> getAll()
    {
        return rep.findAll();
    }

    public List<AkshuDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<AkshuDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
