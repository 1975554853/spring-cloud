package com.cx.loginclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoginClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginClientApplication.class, args);
    }
}
