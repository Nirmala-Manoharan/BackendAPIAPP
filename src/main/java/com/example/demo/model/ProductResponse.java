package com.example.demo.model;

import java.util.Date;

public class ProductResponse {

    private String id;
    private String name;
    private long listPrice;
    private long salePrice;
    private long discount;
    private String description;
    private int stock;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListPrice(long listPrice) {
        this.listPrice = listPrice;
    }

    public void setSalePrice(long salePrice) {
        this.salePrice = salePrice;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getListPrice() {
        return listPrice;
    }

    public long getSalePrice() {
        return salePrice;
    }

    public long getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }
}
