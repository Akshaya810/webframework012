package com.examly.class_exercise_2.Akshuservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_2.Akshucontroller.AkshuCourseController;
import com.examly.class_exercise_2.Akshumodel.AkshuCourse;
import com.examly.class_exercise_2.Akshurepository.AkshuCourseRepo;

@Service
public class AkshuCourseService {

     @Autowired
     public AkshuCourseRepo courseRepo;

     public AkshuCourse SaveEntity(AkshuCourse entity) {
          return courseRepo.save(entity);

     }

     public List<AkshuCourseController> getDetails() {
          return courseRepo.findAll();

     }

     public List<AkshuCourse> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
