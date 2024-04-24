package com.example.relation.Akshuservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.Akshumodel.AkshuStudent;
import com.example.relation.Akshurepository.AkshuStudentRepository;

@Service
public class AkshuStudentService {
    public AkshuStudentRepository studentRepository;
    public AkshuStudentService(AkshuStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public AkshuStudent saveStudent(AkshuStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AkshuStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
