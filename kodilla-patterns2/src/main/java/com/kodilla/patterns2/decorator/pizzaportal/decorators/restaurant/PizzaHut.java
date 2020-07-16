package com.kodilla.patterns2.decorator.pizzaportal.decorators.restaurant;

import com.kodilla.patterns2.decorator.pizzaportal.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizzaportal.PizzaOrder;

import java.math.BigDecimal;

public class PizzaHut extends AbstractPizzaOrderDecorator {
    public PizzaHut(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "from \"PizzaHut\":\n";
    }
}