package com.medeirosgabriel.ada.t1043.web2.service;

import com.medeirosgabriel.ada.t1043.web2.dto.ProductDTO;
import com.medeirosgabriel.ada.t1043.web2.entity.Product;
import com.medeirosgabriel.ada.t1043.web2.respository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product insertProduct(ProductDTO productDTO) {
        Product product = new Product(productDTO.getName(), productDTO.getDescription(), productDTO.getPrice());
        return this.productRepository.save(product);
    }

    @Override
    public Product getProductById(String productId) {
        return this.productRepository.findById(productId).get();
    }
}
