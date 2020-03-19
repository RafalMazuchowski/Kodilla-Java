package com.kodilla.good.patterns.challenges.second.retrieving;

import com.kodilla.good.patterns.challenges.second.realization.OrderRequest;
import com.kodilla.good.patterns.challenges.second.realization.input.Price;
import com.kodilla.good.patterns.challenges.second.realization.input.Product;
import com.kodilla.good.patterns.challenges.second.realization.input.User;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Amanda", "Stark");
        Price price = new Price(3.5, 1);
        Product product = new Product("Book", "Harry Potter I");
        return new OrderRequest(user, price, product);
    }
}
