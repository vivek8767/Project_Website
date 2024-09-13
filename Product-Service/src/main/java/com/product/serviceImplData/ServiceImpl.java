package com.product.serviceImplData;


import com.product.entity.Product;
import com.product.reposetory.ProductRepo;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Override
    public void createProduct(Product product) {
        productRepo.insert(product);
    }
}
