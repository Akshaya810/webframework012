package com.examly.class_exercise_1.Akshuservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.Akshumodel.AkshuPerson;
import com.examly.class_exercise_1.Akshurepository.AkshuPersonRepo;

@Service
public class AkshuPersonService {

     @Autowired
     public AkshuPersonRepo personRepo;

     public AkshuPerson SaveEntity(AkshuPerson entity) {
          return personRepo.save(entity);

     }

     public List<AkshuPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<AkshuPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
