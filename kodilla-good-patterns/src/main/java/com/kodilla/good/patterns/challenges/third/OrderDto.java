package com.kodilla.good.patterns.challenges.third;


import com.kodilla.good.patterns.challenges.third.units.DeliverID;
import com.kodilla.good.patterns.challenges.third.units.ProducerID;

public class OrderDto {
    private DeliverID deliverID;
    private ProducerID producerID;
    private boolean isDelivered;

    public OrderDto(DeliverID deliverID, ProducerID producerID, boolean isDelivered) {
        this.deliverID = deliverID;
        this.producerID = producerID;
        this.isDelivered = isDelivered;
    }

    public DeliverID getDeliverID() {
        return deliverID;
    }

    public ProducerID getProducerID() {
        return producerID;
    }

    public boolean isDelivered() {
        return isDelivered;
    }
}
