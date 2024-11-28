package com.microservice.course.service;


import com.microservice.course.client.StudentClient;
import com.microservice.course.dto.StudentDto;
import com.microservice.course.entity.Course;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.interfaces.ICourse;
import com.microservice.course.repository.ICourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourse {
    private final ICourseRepository iCourseRepository;
    private final StudentClient studentClient;

    public CourseService(ICourseRepository iCourseRepository, StudentClient studentClient) {
        this.iCourseRepository = iCourseRepository;
        this.studentClient = studentClient;
    }

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

    @Override
    public StudentByCourseResponse findStudentByIdCourse(Long idCourse) {
        Course course = iCourseRepository.findById(idCourse).orElse(new Course());
        List<StudentDto> studentDtoList = studentClient.findAllStudentByCourse(idCourse);
        return StudentByCourseResponse
                .builder()
                .courseName(course.getName())
                .teacher(course.getTheacher())
                .studentDtosList(studentDtoList)
                .build();
    }
}
