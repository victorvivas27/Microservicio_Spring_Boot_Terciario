package com.microservice.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEurekaApplication {
    static Logger LOGGER = LoggerFactory.getLogger(MicroserviceEurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaApplication.class, args);
        LOGGER.info("Microservice Eureka Server started port: http://localhost:8761 ");

    }
}
