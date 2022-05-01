package com.example.springbootmicroserviceproduct.repository;

import com.example.springbootmicroserviceproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {

    //Product findByPriceGreaterThan();

}
