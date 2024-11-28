package com.microservice.course.client;

import com.microservice.course.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservicio-studen", url = "localhost:8080/api/student")
public interface StudentClient {
    @GetMapping("/search-by-course/{idCourse}")
    List<StudentDto> findAllStudentByCourse(@PathVariable Long idCourse);


}
