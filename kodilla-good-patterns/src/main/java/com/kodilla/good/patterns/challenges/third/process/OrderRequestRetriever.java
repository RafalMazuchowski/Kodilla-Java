package com.kodilla.good.patterns.challenges.third.process;

import com.kodilla.good.patterns.challenges.third.models.OrderDto;

import static com.kodilla.good.patterns.challenges.third.models.FoodType.DINNER;
import static com.kodilla.good.patterns.challenges.third.shops.Shop.GLUTEN_FREE_SHOP;

public class OrderRequestRetriever {
    public OrderDto retrieve (){
        return new OrderDto(GLUTEN_FREE_SHOP, DINNER, 2);
    }
}
