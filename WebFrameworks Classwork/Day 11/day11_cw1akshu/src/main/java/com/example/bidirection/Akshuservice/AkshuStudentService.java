package com.example.bidirection.Akshuservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.Akshumodel.AkshuStudent;
import com.example.bidirection.Akshumodel.AkshuStudentInfo;
import com.example.bidirection.Akshurepository.AkshuStudentInfoRepository;
import com.example.bidirection.Akshurepository.AkshuStudentRepository;

@Service
public class AkshuStudentService {
    public AkshuStudentRepository studentRepository;
    public AkshuStudentInfoRepository studentInfoRepository;
    public AkshuStudentService(AkshuStudentRepository studentRepository,AkshuStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public AkshuStudent saveStudent(AkshuStudent student)
    {
        return studentRepository.save(student);
    }
    public AkshuStudentInfo saveStudentInfo(AkshuStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<AkshuStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
