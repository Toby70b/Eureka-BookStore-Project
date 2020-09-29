package com.example.bookstore.services;

import com.example.bookstore.models.AuthorDetails;
import com.example.bookstore.models.Book;
import com.example.bookstore.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    @Autowired
    @LoadBalanced
    RestTemplate restTemplate;

    private final BookRepository bookRepository;

    public void createNewBook(Book book) {
        bookRepository.save(book);
    }

    public Book getBookById(String id) {
        Optional<Book> optional = bookRepository.findById(id);
        Book book = new Book();
        if (optional.isPresent()) {
            book = optional.get();
        }
        HttpEntity<AuthorDetails> authorDetailsResponseEntity = restTemplate.exchange(
                "http://author-service/api/author/"+book.getAuthorId(),
                HttpMethod.GET,
                null,
                AuthorDetails.class);

        book.setAuthorDetails(authorDetailsResponseEntity.getBody());
        return book;
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
