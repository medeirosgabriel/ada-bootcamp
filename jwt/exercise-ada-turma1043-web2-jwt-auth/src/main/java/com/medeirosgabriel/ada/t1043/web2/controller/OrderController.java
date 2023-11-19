package com.medeirosgabriel.ada.t1043.web2.controller;

import com.medeirosgabriel.ada.t1043.web2.dto.OrderDTO;
import com.medeirosgabriel.ada.t1043.web2.entity.Order;
import com.medeirosgabriel.ada.t1043.web2.service.OrderServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/orders")
@AllArgsConstructor
public class OrderController {

    private final OrderServiceImpl orderService;

    @PostMapping
    public ResponseEntity<Order> insertOrder(@RequestBody OrderDTO orderDTO) {
        Order order = this.orderService.insertOrder(orderDTO);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Order>> getOrders() {
        List<Order> orders = this.orderService.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

}
