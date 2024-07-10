package com.fts.store.controller;

import com.fts.store.entity.Product;
import com.fts.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public Product postProduct(@RequestBody Product product){
        return productService.postProduct(product);
    }
    @GetMapping("/read/{id}")
    public Product getProduct(@PathVariable Long id){
        return this.productService.getProduct(id);
    }
    @GetMapping("/read/all")
    public List<Product> getProductAll(){
        return this.productService.getProductAll();
    }


}
