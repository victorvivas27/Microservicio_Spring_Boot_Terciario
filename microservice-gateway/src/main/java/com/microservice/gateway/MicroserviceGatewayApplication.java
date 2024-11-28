package com.microservice.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceGatewayApplication {
    static Logger LOGGER = LoggerFactory.getLogger(MicroserviceGatewayApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceGatewayApplication.class, args);
        LOGGER.info("Microservice Gateway Application started port: http://localhost:8080");
    }

}
