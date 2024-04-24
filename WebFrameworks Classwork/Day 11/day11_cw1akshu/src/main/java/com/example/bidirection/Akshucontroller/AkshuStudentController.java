package com.example.bidirection.Akshucontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.Akshumodel.AkshuStudent;
import com.example.bidirection.Akshumodel.AkshuStudentInfo;
import com.example.bidirection.Akshuservice.AkshuStudentService;

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
    @PostMapping("/api/poststudent")
    public AkshuStudent postMethodName(@RequestBody AkshuStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public AkshuStudentInfo postMethodName(@RequestBody AkshuStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<AkshuStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}