package com.assgnment.demo.service;

import com.assgnment.demo.entity.Product;
import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    Product getProductById(Integer id);
    List<Product> getAllProducts();
    void deleteProductById(Integer id);
}
