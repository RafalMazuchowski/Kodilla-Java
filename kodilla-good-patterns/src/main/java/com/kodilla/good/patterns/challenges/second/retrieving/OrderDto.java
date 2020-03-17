package com.kodilla.good.patterns.challenges.second.retrieving;


import com.kodilla.good.patterns.challenges.second.realization.input.User;

public class OrderDto {
    private User user;
    private boolean ordered;

    public OrderDto(final User user, final boolean isRented) {
        this.user = user;
        this.ordered = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return ordered;
    }
}
