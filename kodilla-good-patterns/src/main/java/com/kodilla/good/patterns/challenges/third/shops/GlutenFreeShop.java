package com.kodilla.good.patterns.challenges.third.shops;

import com.kodilla.good.patterns.challenges.third.models.OrderDto;

public class GlutenFreeShop implements ShopService {
    @Override
    public boolean process(OrderDto orderDto) {
        System.out.println("Order: " + orderDto.getFoodType() + ", qty: " + orderDto.getQuantity());
        return true;
    }
}
