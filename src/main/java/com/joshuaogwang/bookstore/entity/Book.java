package com.joshuaogwang.bookstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
@Entity
public class Book {
    @Id
    @GeneratedValue
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
