package com.product.reposetory;

import com.product.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo  extends MongoRepository<Product,String> {
}
