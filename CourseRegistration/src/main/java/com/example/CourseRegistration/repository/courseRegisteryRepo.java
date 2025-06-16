package com.example.CourseRegistration.repository;

import com.example.CourseRegistration.model.courseRegistery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRegisteryRepo extends JpaRepository<courseRegistery,Integer> {

}
