package com.microservice.studen.interfaces;

import com.microservice.studen.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    void deleteById(Long id);

    List<Student> findByIdCourse(Long idCourse);

}
