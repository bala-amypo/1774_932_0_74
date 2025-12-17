package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private string email;
    private float cgpa;

    public void setName(String name){
        this.name=name;
    }
    public void getName(){
        return this.name;
    }
     public void setEmail(String email){
        this.email=email;
    }
    public void getEmail(){
        return this.email;
    }
     public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public void getName(){
        return this.name;
    }

}