package com.microservice.course.interfaces;

import com.microservice.course.entity.Course;

import java.util.List;

public interface ICourse {

    List<Course>findAll();
    Course findById(Long id);
    void save(Course course);
}
