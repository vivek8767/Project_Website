package com.product.controller;

import com.product.entity.Product;
import com.product.serviceImplData.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ServiceImpl service;


@PostMapping("/create")
    public String saveProduct(@RequestBody Product product)
{
    service.createProduct(product);
    return "Created";
    }
}