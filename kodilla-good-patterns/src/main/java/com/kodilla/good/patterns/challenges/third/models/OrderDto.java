package com.kodilla.good.patterns.challenges.third.models;

import com.kodilla.good.patterns.challenges.third.shops.Shop;

public class OrderDto {
    private Shop shop;
    private FoodType foodType;
    private int quantity;

    public OrderDto(Shop shop, FoodType foodType, int quantity) {
        this.shop = shop;
        this.foodType = foodType;
        this.quantity = quantity;
    }

    public Shop getShop() {
        return shop;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public int getQuantity() {
        return quantity;
    }
}
