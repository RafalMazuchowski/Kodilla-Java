package com.kodilla.good.patterns.challenges.second.realization;

import com.kodilla.good.patterns.challenges.second.inform.InformationService;
import com.kodilla.good.patterns.challenges.second.ordering.OrderService;
import com.kodilla.good.patterns.challenges.second.repo.OrderingRepository;
import com.kodilla.good.patterns.challenges.second.retrieving.OrderDto;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderingRepository orderingRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderingRepository orderingRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderingRepository = orderingRepository;
    }

    public OrderDto process(final OrderRequest orderRequestRetriever) {
        boolean isOrdered = orderService.order(orderRequestRetriever.getUser(), orderRequestRetriever.getPrice(), orderRequestRetriever.getProduct());

        if(isOrdered) {
            informationService.inform(orderRequestRetriever.getUser());
            orderingRepository.createOrdering(orderRequestRetriever.getUser(), orderRequestRetriever.getPrice(), orderRequestRetriever.getProduct());
            return new OrderDto(orderRequestRetriever.getUser(), true);
        } else {
            return new OrderDto(orderRequestRetriever.getUser(), false);
        }
    }
}