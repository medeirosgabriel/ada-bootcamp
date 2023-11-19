package com.medeirosgabriel.ada.t1043.web2.service;

import com.medeirosgabriel.ada.t1043.web2.dto.OrderItemDTO;
import com.medeirosgabriel.ada.t1043.web2.entity.Order;
import com.medeirosgabriel.ada.t1043.web2.entity.OrderItem;
import com.medeirosgabriel.ada.t1043.web2.entity.Product;
import com.medeirosgabriel.ada.t1043.web2.respository.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderServiceImpl orderService;
    private final ProductServiceImpl productService;
    private final OrderItemRepository orderItemRepository;

    @Override
    public OrderItem insertOrderItem(OrderItemDTO orderItemDTO) {
        Order order = this.orderService.getOrderById(orderItemDTO.getOrderId());
        Product product = this.productService.getProductById(orderItemDTO.getProductId());
        OrderItem orderItem = new OrderItem(order, product, orderItemDTO.getQuantity());
        order.addOrderItem(orderItem);
        this.orderService.updateOrder(order);
        return this.orderItemRepository.save(orderItem);
    }
}
