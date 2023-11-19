package com.medeirosgabriel.ada.t1043.web2.service;

import com.medeirosgabriel.ada.t1043.web2.dto.ProductDTO;
import com.medeirosgabriel.ada.t1043.web2.entity.Product;

public interface ProductService {

    Product insertProduct(ProductDTO productDTO);

    Product getProductById(String productId);
}
