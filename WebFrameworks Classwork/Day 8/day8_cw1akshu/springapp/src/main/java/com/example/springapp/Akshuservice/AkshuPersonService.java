package com.example.springapp.Akshuservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Akshumodel.AkshuPerson;
import com.example.springapp.Akshurepository.AkshuPersonRepo;

@Service
public class AkshuPersonService {
    @Autowired
    private AkshuPersonRepo rep;

    public boolean post(AkshuPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AkshuPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<AkshuPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
