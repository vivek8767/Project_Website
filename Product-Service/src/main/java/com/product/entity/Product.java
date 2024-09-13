package com.product.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value="product")
public class Product {

     @Id
    private String id;
    private String name;
    private String  desc;
    private double price;


}
