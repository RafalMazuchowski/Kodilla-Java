package com.kodilla.good.patterns.challenges.third;

import com.kodilla.good.patterns.challenges.third.inform.IInformationService;
import com.kodilla.good.patterns.challenges.third.delivery.IDeliveryProcess;
import com.kodilla.good.patterns.challenges.third.ordering.IOrder;

public class DeliveryService {
    private IInformationService iInformationService;
    private IDeliveryProcess iDeliveryProcess;
    private IOrder iOrder;

    public DeliveryService(IInformationService iInformationService, IDeliveryProcess iDeliveryProcess, IOrder iOrder) {
        this.iInformationService = iInformationService;
        this.iDeliveryProcess = iDeliveryProcess;
        this.iOrder = iOrder;
    }
}
