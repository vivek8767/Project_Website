package com.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

@Data
@Document(value="product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

     @Id
    private String id;
    private String name;
    private String  desc;
    private double price;


}
