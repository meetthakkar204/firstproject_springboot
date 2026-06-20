package com.learnspringboot.firstproject.repositories;
import com.learnspringboot.firstproject.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product, Long> {

}
