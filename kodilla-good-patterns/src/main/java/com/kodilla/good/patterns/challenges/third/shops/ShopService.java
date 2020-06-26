package com.kodilla.good.patterns.challenges.third.shops;

import com.kodilla.good.patterns.challenges.third.models.OrderDto;

public interface ShopService {
    boolean process(OrderDto orderDto);
}
