package com.productReacctive.demo.service;

import com.productReacctive.demo.entity.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Flux<Product> findAllProducts();

    Mono<Product> saveProduct(Product product);

    Mono<Product> findByName(String name);

    Mono<Void> deleteById(Long id);
}
