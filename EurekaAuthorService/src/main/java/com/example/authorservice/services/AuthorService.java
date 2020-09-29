package com.example.authorservice.services;

import com.example.authorservice.models.Author;
import com.example.authorservice.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public void createNewAuthor(Author author){
        authorRepository.save(author);
    }

    public Author getAuthorById(String id){return authorRepository.findById(id).orElseThrow();}

}
