package com.microservice.studen.service;

import com.microservice.studen.entity.Student;
import com.microservice.studen.interfaces.IStudentService;
import com.microservice.studen.persistence.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentsServiseImpl implements IStudentService {
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long idStudent) {
        return studentRepository.findById(idStudent).orElseThrow();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }


    @Override
    public List<Student> findByCourseId(Long courseId) {
        return studentRepository.findAllByCourseId(courseId);
    }
}
