package com.kodilla.good.patterns.challenges.third.shops;

import com.kodilla.good.patterns.challenges.third.models.OrderDto;

public class ExtraFoodShop implements ShopService {
    @Override
    public boolean process(OrderDto orderDto) {
        System.out.println("Food type: " + orderDto.getFoodType() + ", quantity: " + orderDto.getQuantity());
        return true;
    }
}
