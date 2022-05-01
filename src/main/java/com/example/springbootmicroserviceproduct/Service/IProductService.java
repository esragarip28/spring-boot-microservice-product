package com.example.springbootmicroserviceproduct.Service;

import com.example.springbootmicroserviceproduct.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
