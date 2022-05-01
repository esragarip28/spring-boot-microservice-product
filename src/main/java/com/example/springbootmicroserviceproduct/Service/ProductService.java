package com.example.springbootmicroserviceproduct.Service;

import com.example.springbootmicroserviceproduct.repository.IProductRepository;
import com.example.springbootmicroserviceproduct.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private  IProductRepository productRepository;

    /*
    private final IProductRepository productRepository;
    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }*/

    @Override
    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);

    }

    @Override
    public void deleteProduct(Long productId){
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts(){
        return  productRepository.findAll();
    }
}
