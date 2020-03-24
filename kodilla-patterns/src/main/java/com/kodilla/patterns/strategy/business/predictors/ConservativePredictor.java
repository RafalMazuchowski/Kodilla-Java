package com.kodilla.patterns.strategy.business.predictors;

import com.kodilla.patterns.strategy.business.BuyPredictor;

public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}