package com.jevendstout.jevendstout.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Entity
@Table(name = "ARTICLES")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articleId;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", nullable = false)
    private Category category;

    @Column(name = "ARTICLE_NAME", nullable = false)
    private String articleName;

    @Column(name = "PRICE_HT", nullable = false)
    private BigDecimal priceHt;
}
