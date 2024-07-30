package com.aanchal.simpleWebApp.controller;
import com.aanchal.simpleWebApp.model.Product;
import com.aanchal.simpleWebApp.service.ProductService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class ProductController {
    @Autowired //we need the object so we have to ask for it
    //the object will be created inside the spring container because of thwe service component
    ProductService service;
    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    } 
}
