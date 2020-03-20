package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    private final double a = 3;
    private final double b = 2;
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addition, subtraction, multiplication, division;
        addition = calculator.add(a, b);
        subtraction = calculator.sub(a, b);
        multiplication = calculator.mul(a, b);
        division = calculator.div(a, b);

        //Then
        Assert.assertEquals(addition, 5.0, 0.0);
        Assert.assertEquals(subtraction, 1.0, 0.0);
        Assert.assertEquals(multiplication, 6.0, 0.0);
        Assert.assertEquals(division, 1.5, 0.0);
    }
}

