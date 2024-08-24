package com.joshuaogwang.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_items")
@Entity
public class OrderItem {
    private Long id;
    private int quantity;
    private double price;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
