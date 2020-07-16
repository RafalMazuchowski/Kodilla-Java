package com.kodilla.patterns2.decorator.pizzaportal.decorators.ingredients;

import com.kodilla.patterns2.decorator.pizzaportal.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizzaportal.PizzaOrder;

import java.math.BigDecimal;

public class Ham extends AbstractPizzaOrderDecorator {
    public Ham(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ Ham ";
    }
}