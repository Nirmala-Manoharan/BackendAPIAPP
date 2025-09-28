package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRequest {

    private String name;
    private long listPrice;
    private long salePrice;
    private long discount;
    private String description;
    private int stock;
    private String createdBy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getListPrice() {
        return listPrice;
    }

    public void setListPrice(long listPrice) {
        this.listPrice = listPrice;
    }

    public long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(long salePrice) {
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
