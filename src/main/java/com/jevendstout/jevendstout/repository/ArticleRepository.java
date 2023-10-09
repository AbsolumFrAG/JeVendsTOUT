package com.jevendstout.jevendstout.repository;

import com.jevendstout.jevendstout.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
