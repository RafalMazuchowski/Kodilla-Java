package com.kodilla.good.patterns.challenges.second.realization;

import com.kodilla.good.patterns.challenges.second.inform.MailService;
import com.kodilla.good.patterns.challenges.second.ordering.GamesOrderService;
import com.kodilla.good.patterns.challenges.second.repo.GamesOrdersRepository;
import com.kodilla.good.patterns.challenges.second.retrieving.OrderRequestRetriever;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new GamesOrderService(), new GamesOrdersRepository());
        productOrderService.process(orderRequest);
    }
}
