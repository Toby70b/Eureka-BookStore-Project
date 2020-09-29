package com.example.authorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AuthorserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorserviceApplication.class, args);
    }

}
