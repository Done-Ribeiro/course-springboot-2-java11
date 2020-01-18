package com.done.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.done.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
