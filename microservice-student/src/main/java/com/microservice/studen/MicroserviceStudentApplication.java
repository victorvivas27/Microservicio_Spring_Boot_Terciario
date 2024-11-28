package com.microservice.studen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceStudentApplication {
    static Logger LOGGER = LoggerFactory.getLogger(MicroserviceStudentApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceStudentApplication.class, args);
        LOGGER.info("Microservice Student Application started port: http://localhost:8090");
    }

}
