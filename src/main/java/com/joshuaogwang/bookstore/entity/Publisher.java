package com.joshuaogwang.bookstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "publishers")
@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    private String country;
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;
}
