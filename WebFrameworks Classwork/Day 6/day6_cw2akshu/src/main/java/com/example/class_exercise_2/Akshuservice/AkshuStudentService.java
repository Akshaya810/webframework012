package com.example.class_exercise_2.Akshuservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.Akshumodel.AkshuStudent;
import com.example.class_exercise_2.Akshurepository.AkshuStudentRepo;

@Service
public class AkshuStudentService {

     @Autowired
     public AkshuStudentRepo studentRepo;

     public List<AkshuStudent> getAll() {
          return studentRepo.findAll();
     }

     public AkshuStudent post(AkshuStudent student) {
          return studentRepo.save(student);
     }

     public List<AkshuStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
