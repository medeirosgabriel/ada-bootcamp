package com.medeirosgabriel.ada.t1043.web2.service;

import com.medeirosgabriel.ada.t1043.web2.dto.OrderDTO;
import com.medeirosgabriel.ada.t1043.web2.entity.Order;
import com.medeirosgabriel.ada.t1043.web2.entity.User;
import com.medeirosgabriel.ada.t1043.web2.respository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final UserServiceImpl userService;

    @Override
    public Order insertOrder(OrderDTO orderDTO) {
        User user = this.userService.findById(orderDTO.getUserId());
        Order order = new Order(user);
        return this.orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long orderId) {
        return this.orderRepository.findById(orderId).get();
    }

    @Override
    public Order updateOrder(Order order) {
        return this.orderRepository.save(order);
    }
}
