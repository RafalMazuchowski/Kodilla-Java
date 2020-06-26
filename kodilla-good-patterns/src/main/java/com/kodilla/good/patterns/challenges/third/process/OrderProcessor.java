package com.kodilla.good.patterns.challenges.third.process;

import com.kodilla.good.patterns.challenges.third.models.OrderDto;
import com.kodilla.good.patterns.challenges.third.shops.*;

public class OrderProcessor {
    public boolean process (final OrderDto orderDto) {
        ShopService shopService = getShopService(orderDto.getShop());
        if (shopService != null) {
            return shopService.process(orderDto);
        } else {
            return false;
        }
    }

    private ShopService getShopService(Shop shop) {
        switch (shop) {
            case EXTRA_FOOD_SHOP:
                return new ExtraFoodShop();
            case HEALTHY_SHOP:
                return new HealthyShop();
            case GLUTEN_FREE_SHOP:
                return new GlutenFreeShop();
            default:
                return null;
        }
    }
}
