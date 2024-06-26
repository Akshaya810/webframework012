package com.examly.class_exercise_1.Akshumodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AkshuPerson {

     @Id
     private int personId;
     private String firstName;
     private String lastName;
     private int age;
     private String gender;

     public AkshuPerson() {

     }

     public AkshuPerson(int personId, String firstName, String lastName, int age, String gender) {
          this.personId = personId;
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;
          this.gender = gender;
     }

     public int getPersonId() {
          return personId;
     }

     public void setPersonId(int personId) {
          this.personId = personId;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getGender() {
          return gender;
     }

     public void setGender(String gender) {
          this.gender = gender;
     }

}
