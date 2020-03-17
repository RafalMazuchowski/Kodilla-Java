package com.kodilla.good.patterns.challenges.second.ordering;

import com.kodilla.good.patterns.challenges.second.realization.input.Price;
import com.kodilla.good.patterns.challenges.second.realization.input.Product;
import com.kodilla.good.patterns.challenges.second.realization.input.User;

public interface OrderService {
    boolean order(User user, Price price, Product product);
}
