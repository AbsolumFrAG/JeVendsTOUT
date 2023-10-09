package com.jevendstout.jevendstout.repository;

import com.jevendstout.jevendstout.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
