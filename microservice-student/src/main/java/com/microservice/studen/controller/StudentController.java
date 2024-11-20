package com.microservice.studen.controller;

import com.microservice.studen.entity.Student;
import com.microservice.studen.interfaces.IStudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/student")
@RestController
@AllArgsConstructor
public class StudentController {
    private final IStudentService iStudentService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        iStudentService.save(student);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok((iStudentService.findById(id)));
    }

    @GetMapping("/aLL")
    public ResponseEntity<?> findAllStudents() {
        return ResponseEntity.ok(iStudentService.findAll());
    }

    @GetMapping("search-ny-course/{idCourse")
    public ResponseEntity<?> findByIdCourse(Long idCourse) {
        return ResponseEntity.ok(iStudentService.findByIdCourse(idCourse));

    }
}
