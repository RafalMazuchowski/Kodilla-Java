package com.kodilla.patterns.strategy.social.media;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class InstagramPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "OMG I look fabulous!";
    }
}
