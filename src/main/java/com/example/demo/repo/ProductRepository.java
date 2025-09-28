package com.example.demo.repo;

import com.example.demo.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, String> {

    List<Product> findByName(String name);
}
