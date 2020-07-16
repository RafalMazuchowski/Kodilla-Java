package com.kodilla.patterns2.decorator.pizzaportal.decorators.size;

import com.kodilla.patterns2.decorator.pizzaportal.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizzaportal.PizzaOrder;

import java.math.BigDecimal;

public class Small extends AbstractPizzaOrderDecorator {
    public Small(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Size: 32cm ";
    }
}