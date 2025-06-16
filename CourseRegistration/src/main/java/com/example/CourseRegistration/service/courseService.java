package com.example.CourseRegistration.service;

import com.example.CourseRegistration.model.Course;
import com.example.CourseRegistration.model.courseRegistery;
import com.example.CourseRegistration.repository.courseRegisteryRepo;
import com.example.CourseRegistration.repository.courseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseService {
    @Autowired
    courseRepo courserepo;
    @Autowired
    private courseRegisteryRepo courseregisteryRepo;

    public String enrolledCourse(String name, String emailId, String courseName) {
        courseRegistery courseregistery=new courseRegistery(name,emailId,courseName);
        courseregisteryRepo.save(courseregistery);
        return name;
    }

    public List<Course> availableCourse() {
        return courserepo.findAll();
    }

    public List<courseRegistery> enrolledStudent() {
     return courseregisteryRepo.findAll();
    }
}
