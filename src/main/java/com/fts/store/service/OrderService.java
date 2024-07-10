package com.fts.store.service;

import com.fts.store.entity.Orders;
import com.fts.store.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public Orders postOrder(Orders orders) {
        return this.orderRepository.save(orders);
    }
    public Orders getOrder(Long id) {
        return this.orderRepository.findById(id).orElseThrow(()->new RuntimeException("Orders Not Found"));
    }
    public List<Orders> getOrderAll() {
        return this.orderRepository.findAll();
    }
}
