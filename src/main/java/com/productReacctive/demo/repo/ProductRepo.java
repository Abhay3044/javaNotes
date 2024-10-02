package com.productReacctive.demo.repo;

import com.productReacctive.demo.entity.Product;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ProductRepo extends ReactiveCrudRepository<Product, Long> {

    @Query("SELECT * FROM product_info2 WHERE name = :name")
    Mono<Product> findByName(String name);
}
