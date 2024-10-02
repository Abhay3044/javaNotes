package com.productReacctive.demo.controller;

import com.productReacctive.demo.entity.Product;
import com.productReacctive.demo.repo.ProductRepo;
import com.productReacctive.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.reflect.Field;

@RestController
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class ProductController {

//    @Autowired
//    private ProductRepo productRepo;
//
//    @GetMapping("/findAll")
//    public Flux<Product> getAllProducts() {
//        return productRepo.findAll();
//    }
//    @Autowired
    private final ProductService productService;

    @GetMapping("/findAll")
    public Flux<Product> geAllProducts2(){
        return productService.findAllProducts();
    }

    @GetMapping("findByName/{name}")
    public Mono<Product> findByName(@PathVariable String name) {
        return productService.findByName(name);
    }


    @PostMapping("/add")
    public Mono<Product> saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteProduct(@PathVariable Long id) {
        return productService.deleteById(id);
    }



}
