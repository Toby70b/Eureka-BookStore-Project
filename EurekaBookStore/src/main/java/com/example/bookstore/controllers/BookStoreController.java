package com.example.bookstore.controllers;

import com.example.bookstore.models.Book;
import com.example.bookstore.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/book")
@RequiredArgsConstructor
public class BookStoreController {

    private final BookService bookService;

    @PostMapping(value = "/")
    public ResponseEntity<String> createAuthor(@RequestBody Book newBook) {
        bookService.createNewBook(newBook);

        return ResponseEntity.status(HttpStatus.OK)
                .body("Book added successfully");
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(bookService.getBookById(id));
    }
}