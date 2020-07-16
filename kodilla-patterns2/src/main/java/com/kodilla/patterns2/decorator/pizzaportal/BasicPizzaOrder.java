package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(14);
    }

    @Override
    public String getDescription() {
        return "Pizza ";
    }
}