package com.example.demo.controller;

import com.example.demo.model.ProductRequest;
import com.example.demo.model.ProductResponse;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private static final String BASE_PATH = "/product";
    private static final String CREATE = BASE_PATH + "/create";
    private static final String GETBYNAME = BASE_PATH + "/getByName";

    @Autowired
    private ProductService productService;

    @PostMapping(path = CREATE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> create(@RequestBody ProductRequest product) {
        boolean result = productService.createProduct(product);
        return new ResponseEntity<>(result, HttpStatusCode.valueOf(200));
    }
    @GetMapping(path = GETBYNAME)
    public ResponseEntity<List<ProductResponse>> getByName(String name){
        List<ProductResponse> productResponseList = productService.getByName(name);
        return new ResponseEntity<>(productResponseList, HttpStatusCode.valueOf(200));
    }
}
