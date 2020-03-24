package com.kodilla.patterns.strategy.business;

import com.kodilla.patterns.strategy.business.predictors.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}