package com.done.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.done.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
