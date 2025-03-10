package com.example.bookstore.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    private String title;
    private String authorId;
    private transient AuthorDetails authorDetails;

    public Book() {
    }
}
