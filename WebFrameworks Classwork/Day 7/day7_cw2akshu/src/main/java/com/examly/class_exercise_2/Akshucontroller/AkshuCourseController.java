package com.examly.class_exercise_2.Akshucontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.Akshumodel.AkshuCourse;
import com.examly.class_exercise_2.Akshurepository.AkshuCourseRepo;

@RestController
public class AkshuCourseController {

     @Autowired
     public AkshuCourseRepo CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<AkshuCourse> postMethodName(@RequestBody AkshuCourse entity) {

          AkshuCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<AkshuCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<AkshuCourse>> getMethodName() {

          List<AkshuCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AkshuCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AkshuCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<AkshuCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}