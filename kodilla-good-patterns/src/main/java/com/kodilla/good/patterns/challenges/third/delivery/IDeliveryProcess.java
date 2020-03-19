package com.kodilla.good.patterns.challenges.third.delivery;

import com.kodilla.good.patterns.challenges.third.units.DeliverID;
import com.kodilla.good.patterns.challenges.third.units.ProducerID;

public interface IDeliveryProcess {
    boolean process (ProducerID producerID, DeliverID deliverID);
}
