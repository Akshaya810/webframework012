package com.examly.class_exercise_1.Akshucontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.Akshumodel.AkshuPerson;
import com.examly.class_exercise_1.Akshurepository.AkshuPersonRepo;

@RestController
public class AkshuPersonController {

     @Autowired
     public AkshuPersonRepo personService;

     @PostMapping("/api/person")
     public ResponseEntity<AkshuPerson> postMethodName(@RequestBody AkshuPersonController entity) {

          AkshuPersonController inst = personService.SaveEntity(entity);

          return new ResponseEntity<AkshuPerson>(HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<AkshuPerson>> getMethodName() {

          List<AkshuPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AkshuPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AkshuPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<com.examly.class_exercise_1.Akshumodel.AkshuPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}