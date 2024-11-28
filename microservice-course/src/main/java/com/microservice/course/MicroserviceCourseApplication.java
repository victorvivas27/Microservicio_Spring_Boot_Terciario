package com.microservice.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MicroserviceCourseApplication {
    static Logger LOGGER = LoggerFactory.getLogger(MicroserviceCourseApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCourseApplication.class, args);
        LOGGER.info("Microservice Course Application started port: http://localhost:9090");
    }

}
