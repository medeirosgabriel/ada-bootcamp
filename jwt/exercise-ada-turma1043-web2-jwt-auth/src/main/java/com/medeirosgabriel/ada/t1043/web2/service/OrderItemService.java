package com.medeirosgabriel.ada.t1043.web2.service;

import com.medeirosgabriel.ada.t1043.web2.dto.OrderItemDTO;
import com.medeirosgabriel.ada.t1043.web2.entity.OrderItem;

public interface OrderItemService {

    OrderItem insertOrderItem(OrderItemDTO orderItemDTO);

}
