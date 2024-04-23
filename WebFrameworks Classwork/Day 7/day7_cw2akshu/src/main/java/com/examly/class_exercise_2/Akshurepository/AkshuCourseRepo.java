package com.examly.class_exercise_2.Akshurepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_2.Akshucontroller.AkshuCourseController;
import com.examly.class_exercise_2.Akshumodel.AkshuCourse;

@Repository
public interface AkshuCourseRepo extends JpaRepository<AkshuCourseController, Integer> {

     List<AkshuCourse> findByCourseName(String courseName);

     AkshuCourse save(AkshuCourse entity);

    List<AkshuCourse> getDetails();

    AkshuCourse SaveEntity(AkshuCourse entity);

}