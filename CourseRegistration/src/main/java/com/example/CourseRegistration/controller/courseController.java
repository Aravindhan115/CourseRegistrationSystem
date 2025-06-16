package com.example.CourseRegistration.controller;

import com.example.CourseRegistration.model.Course;
import com.example.CourseRegistration.model.courseRegistery;
import com.example.CourseRegistration.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.processing.Generated;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class courseController {
    @Autowired
   private courseService CourseService;

    @GetMapping("courses")
    public List<Course> availableCourse() {
        return CourseService.availableCourse();
    }
    @GetMapping("courses/enrolled")
    public List<courseRegistery> enrolledStudent(){
       return CourseService.enrolledStudent();

    }
    @PostMapping("/courses/register")
    public String enrolledCourse(@RequestParam("name") String name,
                                 @RequestParam("emailId") String emailId,
                                 @RequestParam("courseName") String courseName) {
        if (name == null || emailId == null || courseName == null ||
                name.trim().isEmpty() || emailId.trim().isEmpty() || courseName.trim().isEmpty()) {
            return "Invalid input: All fields (name, emailId, courseName) are required.";
        }

        // Enroll the student and get the name (or success message) back
        String enrolledName = CourseService.enrolledCourse(name, emailId, courseName);

        return "Congratulations " + enrolledName + ", you are enrolled in " + courseName + "!";
    }




}
