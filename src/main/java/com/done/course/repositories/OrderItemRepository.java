package com.done.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.done.course.entities.OrderItem;
import com.done.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
