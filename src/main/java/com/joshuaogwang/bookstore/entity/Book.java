package com.joshuaogwang.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Book {
    private Long id;
    private String title;
    private String isbn;
    private String genre;
    private String type;
    private Date publicationYear;
    private double price;
    private String condition;
    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
}
