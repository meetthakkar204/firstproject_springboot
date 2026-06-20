package com.learnspringboot.firstproject.repositories;
import com.learnspringboot.firstproject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
