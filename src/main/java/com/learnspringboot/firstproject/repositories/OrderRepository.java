package com.learnspringboot.firstproject.repositories;

import com.learnspringboot.firstproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
