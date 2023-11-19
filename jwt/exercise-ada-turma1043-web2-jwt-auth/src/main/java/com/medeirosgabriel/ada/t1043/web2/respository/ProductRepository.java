package com.medeirosgabriel.ada.t1043.web2.respository;

import com.medeirosgabriel.ada.t1043.web2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> { }
