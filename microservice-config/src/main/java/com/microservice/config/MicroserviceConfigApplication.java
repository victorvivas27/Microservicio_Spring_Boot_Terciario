package com.microservice.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroserviceConfigApplication {
    static Logger LOGGER = LoggerFactory.getLogger(MicroserviceConfigApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfigApplication.class, args);
        LOGGER.info("Microservice Config Server started port: http://localhost:8888");
    }

}
