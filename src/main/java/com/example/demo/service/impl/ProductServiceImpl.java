package com.example.demo.service.impl;

import com.example.demo.entity.Product;
import com.example.demo.model.ProductRequest;
import com.example.demo.model.ProductResponse;
import com.example.demo.repo.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public boolean createProduct(ProductRequest productRequest) {
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setStock(productRequest.getStock());
        product.setDescription(productRequest.getDescription());
        product.setListPrice(productRequest.getListPrice());
        product.setSalePrice(productRequest.getSalePrice());
        product.setDiscount(productRequest.getDiscount());
        product.setCreatedBy(productRequest.getCreatedBy());
        product.setUpdatedBy(productRequest.getCreatedBy());
        product.setCreatedDate(new Date());
        product.setUpdatedDate(new Date());
        Product result = productRepository.save(product);
        return Objects.nonNull(result);
    }
    @Override
    public List<ProductResponse> getByName(String name){
        List<Product> result = productRepository.findByName(name);
        List<ProductResponse> responseList = new ArrayList<>();
        for(Product product : result){
            ProductResponse response = new ProductResponse();
            response.setId(product.getId());
            response.setName(product.getName());
            response.setStock(product.getStock());
            response.setDescription(product.getDescription());
            response.setListPrice(product.getListPrice());
            response.setSalePrice(product.getSalePrice());
            response.setDiscount(product.getDiscount());
            response.setCreatedBy(product.getCreatedBy());
            response.setUpdatedBy(product.getUpdatedBy());
            response.setCreatedDate(product.getCreatedDate());
            response.setUpdatedDate(product.getUpdatedDate());
            responseList.add(response);
        }
        return responseList;
    }
}


