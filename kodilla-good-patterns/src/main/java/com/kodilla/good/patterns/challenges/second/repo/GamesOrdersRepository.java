package com.kodilla.good.patterns.challenges.second.repo;

import com.kodilla.good.patterns.challenges.second.realization.input.Price;
import com.kodilla.good.patterns.challenges.second.realization.input.Product;
import com.kodilla.good.patterns.challenges.second.realization.input.User;

public class GamesOrdersRepository implements OrderingRepository{
    @Override
    public boolean createOrdering(User user, Price price, Product product) {
        return false;
    }
}
