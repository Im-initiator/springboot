package com.ngoclan.test_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.authentication.AuthenticationManager;

@ComponentScan(basePackages = {"com.ngoclan.config","com.ngoclan.service","com.ngoclan.controller"})
@EntityScan("com.ngoclan.entity")
@EnableJpaRepositories("com.ngoclan.repository")
@SpringBootApplication
public class TestSecurityApplication {
    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(TestSecurityApplication.class, args);
    }


}
