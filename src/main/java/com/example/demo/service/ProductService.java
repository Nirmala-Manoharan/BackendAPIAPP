package com.example.demo.service;

import com.example.demo.model.ProductRequest;
import com.example.demo.model.ProductResponse;

import java.util.List;

public interface ProductService {

    boolean createProduct(ProductRequest productRequest);
    List<ProductResponse> getByName(String name);
}
