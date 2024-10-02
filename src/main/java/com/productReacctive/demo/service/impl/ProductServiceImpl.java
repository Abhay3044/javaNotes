package com.productReacctive.demo.service.impl;

import com.productReacctive.demo.entity.Product;
import com.productReacctive.demo.repo.ProductRepo;
import com.productReacctive.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public Flux<Product> findAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Mono<Product> saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Mono<Product> findByName(String name) {
        return productRepo.findByName(name);
    }

    @Override
    public Mono<Void> deleteById(Long id) {
        return productRepo.deleteById(id);
    }
}
