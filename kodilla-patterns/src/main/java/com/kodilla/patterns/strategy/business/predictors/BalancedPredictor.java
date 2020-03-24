package com.kodilla.patterns.strategy.business.predictors;

import com.kodilla.patterns.strategy.business.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}