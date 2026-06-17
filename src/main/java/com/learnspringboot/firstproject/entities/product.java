package com.learnspringboot.firstproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "product name is required")
    @Column(nullable = false)
    private String name;

    private String description;

    private String category;

    @NotNull(message = "price is required ")
    @DecimalMin(value = "0.0" , inclusive = false , message = "Price must be greater than zero")
    @Column(nullable = false)
    private BigDecimal price;

    @NotNull(message = "stock quantity is required")
    @Min(value = 0 , message = "Stcok can not be less than zero")
    @Column(name = "stock_quantity", nullable = false)
    private Integer stockQuantity;


    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;
}
