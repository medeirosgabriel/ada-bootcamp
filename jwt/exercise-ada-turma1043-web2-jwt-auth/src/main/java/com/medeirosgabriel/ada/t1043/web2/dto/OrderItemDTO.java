package com.medeirosgabriel.ada.t1043.web2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItemDTO {
    private Long orderId;
    private String productId;
    private Integer quantity;
}
