package com.kodilla.patterns2.decorator.pizzaportal;

import com.kodilla.patterns2.decorator.pizzaportal.decorators.ingredients.Cheese;
import com.kodilla.patterns2.decorator.pizzaportal.decorators.ingredients.Olives;
import com.kodilla.patterns2.decorator.pizzaportal.decorators.ingredients.Paprika;
import com.kodilla.patterns2.decorator.pizzaportal.decorators.restaurant.*;
import com.kodilla.patterns2.decorator.pizzaportal.decorators.size.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTestSuite {

    @Test
    void getCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(14), calculatedCost);
    }

    @Test
    void getDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza ", description);
    }

    @Test
    public void getPizzaHutCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaHut(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), calculatedCost);
    }

    @Test
    void getPizzaHutDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaHut(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Pizza from \"PizzaHut\":\n", description);
    }

    @Test
    public void getGreenPizzaBigCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new GreenPizza(theOrder);
        theOrder = new Big(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(47.5), calculatedCost);
    }

    @Test
    void getGreenPizzaBigDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new GreenPizza(theOrder);
        theOrder = new Big(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Pizza from \"Green Pizza\":\nSize: 60cm ", description);
    }

    @Test
    public void getGreenPizzaMediumWithIngredientsCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new GreenPizza(theOrder);
        theOrder = new Medium(theOrder);
        theOrder = new Cheese(theOrder);
        theOrder = new Olives(theOrder);
        theOrder = new Paprika(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(41.5), calculatedCost);
    }

    @Test
    void getGreenPizzaMediumWithIngredientsDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new GreenPizza(theOrder);
        theOrder = new Medium(theOrder);
        theOrder = new Cheese(theOrder);
        theOrder = new Olives(theOrder);
        theOrder = new Paprika(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Pizza from \"Green Pizza\":\nSize: 45cm + Cheese + Olives + Paprika ", description);
    }
}