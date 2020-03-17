package com.kodilla.good.patterns.challenges.second.realization;

import com.kodilla.good.patterns.challenges.second.realization.input.Price;
import com.kodilla.good.patterns.challenges.second.realization.input.Product;
import com.kodilla.good.patterns.challenges.second.realization.input.User;

public class OrderRequest {
    public OrderRequest(User user, Price price, Product product) {
    }

    public User getUser() {
        return new User(getUser().getName(), getUser().getSurname());
    }

    public Price getPrice() {
        return new Price(getPrice().getPrice(), getPrice().getQty());
    }

    public Product getProduct() {
        return new Product(getProduct().getProductName(), getProduct().getProductDescribe());
    }
}
