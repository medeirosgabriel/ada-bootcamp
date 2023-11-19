package com.medeirosgabriel.ada.t1043.web2.respository;

import com.medeirosgabriel.ada.t1043.web2.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
