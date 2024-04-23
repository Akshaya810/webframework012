package com.examly.springapp.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Akshumodel.AkshuStudent;

import java.util.List;

@Repository
public interface AkshuStudentRepo extends JpaRepository<AkshuStudent, Long> {

    List<AkshuStudent> findByMarksGreaterThan(int mark);

    List<AkshuStudent> findByMarksLessThan(int mark);

}
