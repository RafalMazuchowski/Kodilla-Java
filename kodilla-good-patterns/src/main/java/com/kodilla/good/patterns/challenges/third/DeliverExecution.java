package com.kodilla.good.patterns.challenges.third;

import com.kodilla.good.patterns.challenges.third.models.OrderDto;
import com.kodilla.good.patterns.challenges.third.process.OrderProcessor;
import com.kodilla.good.patterns.challenges.third.process.OrderRequestRetriever;

public class DeliverExecution {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderDto orderDto = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor();
        boolean success = orderProcessor.process(orderDto);
        if (success) {
            System.out.println("Success!");
        } else {
            System.out.println("Hungry...");
        }
    }
}
