package com.kodilla.good.patterns.challenges.second.realization.input;

public class Price {
    private double price;
    private int qty;

    public Price(double price, int qty) {
        this.price = price;
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
