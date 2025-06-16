package com.example.CourseRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class courseRegistery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY   )
    private int id;
    private String name;
    private String emailId;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    private String courseName;
    public courseRegistery(int id, String name, String emailId, String courseName) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
    }
    public courseRegistery( String name, String emailId, String courseName) {
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
    }

    public courseRegistery() {
    }
}
