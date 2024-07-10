package com.fts.store.service;

import com.fts.store.entity.Product;
import com.fts.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product postProduct(Product product) {
        return this.productRepository.save(product);
    }

    public Product getProduct(Long id) {
        return this.productRepository.findById(id).orElseThrow(()->new RuntimeException("Product Not Found"));
    }

    public List<Product> getProductAll() {
        return this.productRepository.findAll();
    }
}
