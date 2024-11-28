package com.microservice.studen.controller;

import com.microservice.studen.entity.Student;
import com.microservice.studen.service.StudentsServiseImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/student")
@RestController
@AllArgsConstructor
public class StudentController {
    private final StudentsServiseImpl studentsServise;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentsServise.save(student);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long idStudent) {
        return ResponseEntity.ok((studentsServise.findById(idStudent)));
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudents() {
        return ResponseEntity.ok(studentsServise.findAll());
    }

    @GetMapping("/search-by-course/{courseId}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long courseId) {
        return ResponseEntity.ok(studentsServise.findByCourseId(courseId));

    }
}
