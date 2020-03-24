package com.kodilla.patterns.strategy.business.predictors;

import com.kodilla.patterns.strategy.business.BuyPredictor;

public class AggressivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}