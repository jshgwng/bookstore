package com.joshuaogwang.bookstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_items")
@Entity
public class OrderItem {
    @Id
    @GeneratedValue
    private Long id;
    private int quantity;
    private double price;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
