package com.kodilla.patterns2.decorator.pizzaportal.decorators.size;

import com.kodilla.patterns2.decorator.pizzaportal.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizzaportal.PizzaOrder;

import java.math.BigDecimal;

public class Medium extends AbstractPizzaOrderDecorator {
    public Medium(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(super.getCost().multiply(new BigDecimal(0.5)));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Size: 45cm ";
    }
}