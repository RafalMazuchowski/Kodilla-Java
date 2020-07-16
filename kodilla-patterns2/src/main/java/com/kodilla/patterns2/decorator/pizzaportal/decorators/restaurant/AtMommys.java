package com.kodilla.patterns2.decorator.pizzaportal.decorators.restaurant;

import com.kodilla.patterns2.decorator.pizzaportal.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizzaportal.PizzaOrder;

import java.math.BigDecimal;

public class AtMommys extends AbstractPizzaOrderDecorator {
    public AtMommys(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "from \"At Mommy's\":\n";
    }
}
