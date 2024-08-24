package com.joshuaogwang.bookstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inventory")
@Entity
public class Inventory {
    @Id
    private Long bookId;
    private int stockLevelUsed;
    private int stockLevelNew;
    @OneToOne
    @JoinColumn(name = "bookId", referencedColumnName = "id")
    private Book book;
}
