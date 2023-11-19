package com.medeirosgabriel.ada.t1043.web2.service;

import com.medeirosgabriel.ada.t1043.web2.dto.OrderDTO;
import com.medeirosgabriel.ada.t1043.web2.entity.Order;

import java.util.List;

public interface OrderService {

    Order insertOrder(OrderDTO orderDTO);
    List<Order> getAllOrders();

    Order getOrderById(Long orderId);

    Order updateOrder(Order order);
}
