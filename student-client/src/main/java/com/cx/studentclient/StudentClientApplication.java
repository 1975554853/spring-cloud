package com.cx.studentclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentClientApplication.class, args);
    }
}
