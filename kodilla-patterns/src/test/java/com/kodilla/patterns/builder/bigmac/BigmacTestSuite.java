package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .sauce("Barbecue")
                .ingredients("TomatoeTomatoe")
                .bun("Roll")
                .ingredients("Salad")
                .ingredients("Cheese")
                .ingredients("Mushrooms")
                .burgers("Beef")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
