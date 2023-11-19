package com.medeirosgabriel.ada.t1043.web2.controller;

import com.medeirosgabriel.ada.t1043.web2.dto.OrderItemDTO;
import com.medeirosgabriel.ada.t1043.web2.entity.OrderItem;
import com.medeirosgabriel.ada.t1043.web2.service.OrderItemServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/orderItems")
@AllArgsConstructor
public class OrderItemController {

    private final OrderItemServiceImpl orderItemService;

    @PostMapping
    public ResponseEntity<OrderItem> insertOrderItem(@RequestBody OrderItemDTO orderItemDTO) {
        OrderItem orderItem =  this.orderItemService.insertOrderItem(orderItemDTO);
        return new ResponseEntity<>(orderItem, HttpStatus.CREATED);
    }
}
