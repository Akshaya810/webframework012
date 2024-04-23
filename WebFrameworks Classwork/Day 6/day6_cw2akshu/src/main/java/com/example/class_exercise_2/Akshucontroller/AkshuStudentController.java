package com.example.class_exercise_2.Akshucontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.Akshumodel.AkshuStudent;
import com.example.class_exercise_2.Akshuservice.AkshuStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AkshuStudentController {

     @Autowired
     public AkshuStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<AkshuStudent>> getDetails() {
          List<AkshuStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<AkshuStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AkshuStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<AkshuStudent> postMethodName(@RequestBody AkshuStudent student) {

          AkshuStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<AkshuStudent>> sortedDetails(@PathVariable String field) {
          List<AkshuStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<AkshuStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AkshuStudent>>(list, HttpStatus.OK);

     }
}
