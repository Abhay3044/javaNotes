package com.productReacctive.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_info2")
public class Product {

    @Id
    private Long id;
    private String name;
    private String description;
    private String price;
    private String quantity;


}
