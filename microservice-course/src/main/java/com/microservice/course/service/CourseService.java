package com.microservice.course.service;

import com.microservice.course.entity.Course;
import com.microservice.course.interfaces.ICourse;
import com.microservice.course.repository.ICourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService implements ICourse {
    private final ICourseRepository iCourseRepository;

    @Override
    public List<Course> findAll() {
        return (List<Course>) iCourseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return iCourseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        iCourseRepository.save(course);
    }
}
