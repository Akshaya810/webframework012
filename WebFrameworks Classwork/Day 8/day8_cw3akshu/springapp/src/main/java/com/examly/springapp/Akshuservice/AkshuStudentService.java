package com.examly.springapp.Akshuservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Akshumodel.AkshuStudent;
import com.examly.springapp.Akshurepository.AkshuStudentRepo;

@Service
public class AkshuStudentService {
    @Autowired
    private AkshuStudentRepo studentRepo;

    public boolean post(AkshuStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<AkshuStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<AkshuStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
