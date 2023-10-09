package com.jevendstout.jevendstout.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "CATEGORIES")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(name = "CATEGORY_NAME", nullable = false)
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private Set<Article> articles;
}
