package com.example.authorservice.controllers;

import com.example.authorservice.models.Author;
import com.example.authorservice.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/author")
@RequiredArgsConstructor
public class AuthorController {

    @Autowired
    RestTemplate restTemplate;

    private final AuthorService authorService;

    @PostMapping(value = "/")
    public ResponseEntity<String> createAuthor(@RequestBody Author newAuthor) {
        authorService.createNewAuthor(newAuthor);

        return ResponseEntity.status(HttpStatus.OK)
                .body("Author added successfully");
    }

    @GetMapping(value = "/{id}")
    public Author getAuthorById(@PathVariable String id) {
        return authorService.getAuthorById(id);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
