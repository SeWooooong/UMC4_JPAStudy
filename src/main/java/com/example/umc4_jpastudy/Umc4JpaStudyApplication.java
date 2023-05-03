package com.example.umc4_jpastudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Umc4JpaStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(Umc4JpaStudyApplication.class, args);
    }
}
