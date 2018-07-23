package com.erma.model;

public class Product {
    private Integer id;

    private String productName;

    private String deatil;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getDeatil() {
        return deatil;
    }

    public void setDeatil(String deatil) {
        this.deatil = deatil == null ? null : deatil.trim();
    }
}