package com.example.authorservice.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    private String name;
    private int age;
    private String country;

    public Author() {
    }

}
