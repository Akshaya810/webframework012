package com.example.relation.Akshucontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.Akshumodel.AkshuStudent;
import com.example.relation.Akshuservice.AkshuStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AkshuStudentController {
    public AkshuStudentService studentService;
    public AkshuStudentController(AkshuStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public AkshuStudent postMethodName(@RequestBody AkshuStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<AkshuStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
