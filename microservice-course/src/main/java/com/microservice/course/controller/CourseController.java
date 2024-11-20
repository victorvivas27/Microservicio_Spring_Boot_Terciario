package com.microservice.course.controller;

import com.microservice.course.entity.Course;
import com.microservice.course.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@AllArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@RequestBody Course course){
        courseService.save(course);
    }


    @RequestMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?>getAllCourses() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/search/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return  ResponseEntity.ok(courseService.findById(id));
    }


}
