package com.aanchal.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private int price;
    
    // No-args constructor required by Spring
    public Product() {
    }
}
