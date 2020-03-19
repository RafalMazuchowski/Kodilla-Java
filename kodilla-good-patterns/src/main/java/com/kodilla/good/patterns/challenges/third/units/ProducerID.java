package com.kodilla.good.patterns.challenges.third.units;

public class ProducerID {
    private String producerName;
    private String producerAddress;
    private double marginProfit;

    public ProducerID(String producerName, String producerAddress, double marginProfit) {
        this.producerName = producerName;
        this.producerAddress = producerAddress;
        this.marginProfit = marginProfit;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProducerAddress() {
        return producerAddress;
    }

    public double getMarginProfit() {
        return marginProfit;
    }
}
