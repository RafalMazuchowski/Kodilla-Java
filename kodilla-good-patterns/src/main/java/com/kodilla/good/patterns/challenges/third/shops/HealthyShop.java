package com.kodilla.good.patterns.challenges.third.shops;

import com.kodilla.good.patterns.challenges.third.models.OrderDto;

public class HealthyShop implements ShopService {
    @Override
    public boolean process(OrderDto orderDto) {
        System.out.println("Ordered quantity: " + orderDto.getQuantity() + ", : " + orderDto.getFoodType());
        return true;
    }
}
