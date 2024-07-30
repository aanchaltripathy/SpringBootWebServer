package com.aanchal.simpleWebApp.service;
import com.aanchal.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;



@Service
public class ProductService{
    List<Product> products=Arrays.asList(
        new Product(101,"phone",50000),
        new Product(102,"laptop",70000) );//list of dummy dta 
    //list of type product and should have a constructor to accept it
    public List<Product> getProducts(){
        return products;
    }
}