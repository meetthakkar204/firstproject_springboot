package com.learnspringboot.firstproject.Controllers;

import com.learnspringboot.firstproject.Services.ProductService;
import com.learnspringboot.firstproject.entities.product;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public product createproduct(@Valid @RequestBody product product) {
        return productService.createproduct(product);
    }
    @PutMapping("/{id}")
    public product updateproduct( @PathVariable Long id , @Valid @RequestBody product product ){
        return productService.updateproduct(id, product);
    }
    @GetMapping
    public List<product> getProducts(){
        return productService.getProducts();
    }
    @GetMapping("/{id}")
    public product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
