package com.example.springapp.Akshuservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.Akshumodel.AkshuPerson;
import com.example.springapp.Akshurepository.AkshuPersonRepo;

@Service
public class AkshuPersonService {
    public AkshuPersonRepo personRepo;

    public AkshuPersonService(AkshuPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(AkshuPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<AkshuPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
