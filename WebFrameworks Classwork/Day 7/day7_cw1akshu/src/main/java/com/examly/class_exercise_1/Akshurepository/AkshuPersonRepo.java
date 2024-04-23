package com.examly.class_exercise_1.Akshurepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.Akshucontroller.AkshuPersonController;
import com.examly.class_exercise_1.Akshumodel.AkshuPerson;

/**
 * PersonRepo
 */
@Repository
public interface AkshuPersonRepo extends JpaRepository<AkshuPerson, Integer> {

     List<AkshuPerson> findByAge(int byAge);

    AkshuPersonController SaveEntity(AkshuPersonController entity);

    List<AkshuPerson> getDetails();
}