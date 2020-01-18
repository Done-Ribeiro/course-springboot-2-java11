package com.done.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.done.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
