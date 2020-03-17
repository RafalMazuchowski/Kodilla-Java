package com.kodilla.good.patterns.challenges.second.realization.input;

public class Product {
    private String productName;
    private String productDescribe;

    public Product(String productName, String productDescribe) {
        this.productName = productName;
        this.productDescribe = productDescribe;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescribe() {
        return productDescribe;
    }
}
