package com.medeirosgabriel.ada.t1043.web2.respository;

import com.medeirosgabriel.ada.t1043.web2.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> { }
