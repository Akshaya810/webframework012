package com.example.class_exercise_2.Akshurepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_2.Akshumodel.AkshuStudent;

@Repository
public interface AkshuStudentRepo extends JpaRepository<AkshuStudent, Integer> {

}