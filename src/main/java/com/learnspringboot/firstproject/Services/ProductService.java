package com.learnspringboot.firstproject.Services;

import com.learnspringboot.firstproject.entities.product;
import com.learnspringboot.firstproject.repositories.ProductRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public product createproduct(product product) {
        return productRepository.save(product);
    }
    public product updateproduct(Long id ,  product product ) {
        product existingProduct = productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("product not found with id "+ id));
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setStockQuantity(product.getStockQuantity());

        return productRepository.save(existingProduct);
    }

    public List<product> getProducts(){
        return productRepository.findAll();
    }
    public product getProductById(Long id){
        return productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("product not found with id "+ id));
    }
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
