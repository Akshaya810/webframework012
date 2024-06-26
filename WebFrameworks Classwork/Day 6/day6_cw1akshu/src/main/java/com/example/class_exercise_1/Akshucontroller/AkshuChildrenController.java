package com.example.class_exercise_1.Akshucontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_1.Akshumodel.AkshuChildren;
import com.example.class_exercise_1.Akshuservice.ChildrenService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AkshuChildrenController {

     @Autowired
     public ChildrenService childrenService;

     @GetMapping("/api/children/sortBy/{babyFirstName}")
     public ResponseEntity<List<AkshuChildren>> sort(@PathVariable String babyFirstName) {
          List<AkshuChildren> child = childrenService.sort(babyFirstName);

          if (child.isEmpty()) {

               return new ResponseEntity<>(child, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(child, HttpStatus.OK);

     }

     // Pagination
     @GetMapping("api/children/{offset}/{pagesize}")
     public ResponseEntity<List<AkshuChildren>> pagination(@PathVariable int offset, @PathVariable int pagesize) {
          List<AkshuChildren> pages = childrenService.pagination(offset, pagesize);
          if (pages.isEmpty()) {
               return new ResponseEntity<List<AkshuChildren>>(pages, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AkshuChildren>>(pages, HttpStatus.OK);
     }

     @GetMapping("/api/children/{offset}/{pagesize}/{field}")
     public ResponseEntity<List<AkshuChildren>> sortedPage(@PathVariable int offset, @PathVariable int pagesize,
               @PathVariable String field) {
          List<AkshuChildren> sortedPage = childrenService.sortedPage(offset, pagesize, field);
          if (sortedPage.isEmpty()) {

               return new ResponseEntity<>(sortedPage, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(sortedPage, HttpStatus.OK);
     }

     @PostMapping("/api/children")
     public ResponseEntity<AkshuChildren> postDetails(@RequestBody AkshuChildren children) {

          return new ResponseEntity<AkshuChildren>(childrenService.save(children), HttpStatus.CREATED);
     }

}