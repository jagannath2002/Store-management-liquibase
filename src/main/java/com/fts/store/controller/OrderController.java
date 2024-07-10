package com.fts.store.controller;

import com.fts.store.entity.Orders;
import com.fts.store.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public Orders postOrder(@RequestBody Orders orders){
        return this.orderService.postOrder(orders);
    }
    @GetMapping("/read/{id}")
    public Orders getOrder(@PathVariable Long id){
        return this.orderService.getOrder(id);
    }
    @GetMapping("read/all")
    public List<Orders> getOrderAll(){
        return this.orderService.getOrderAll();
    }

}
