package com.kodilla.good.patterns.challenges.third.delivery;

import com.kodilla.good.patterns.challenges.third.units.DeliverID;
import com.kodilla.good.patterns.challenges.third.units.ProducerID;

public class DeliverToShop implements IDeliveryProcess{
    @Override
    public boolean process(ProducerID producerID, DeliverID deliverID) {
        return false;
    }
}
