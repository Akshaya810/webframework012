package com.example.springapp.Akshumodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AkshuPerson {
    @Id
    private long id;
    private String name;
    private int age;

    public AkshuPerson(){}
    public AkshuPerson(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
    
}
