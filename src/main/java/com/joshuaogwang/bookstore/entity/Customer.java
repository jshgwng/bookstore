package com.joshuaogwang.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
@Entity
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String country;
    private String phoneNumber;
}
