package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.InstagramPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User rafal = new YGeneration("Rafal Mazuchowski");
        User andrea = new Millenials("Andrea Links");
        User john = new ZGeneration("Steven Links");

        //When
        String rafalPosted = rafal.sharePost();
        System.out.println("Rafal posted: " + rafalPosted);
        String andreaPosted = andrea.sharePost();
        System.out.println("Andrea posted: " + andreaPosted);
        String johnPosted = john.sharePost();
        System.out.println("John posted: " + johnPosted);

        //Then
        Assert.assertEquals("Moving to Wroclaw", rafalPosted);
        Assert.assertEquals("OMG I look fabulous!", andreaPosted);
        Assert.assertEquals("YOLO!!! XOXO", johnPosted);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new ZGeneration("Steven Links");

        //When
        String johnPosted = john.sharePost();
        System.out.println("John posted: " + johnPosted);
        john.setPreferredPublisher(new InstagramPublisher());
        johnPosted = john.sharePost();
        System.out.println("John posted: " + johnPosted);

        //Then
        Assert.assertEquals("OMG I look fabulous!", johnPosted);
    }
}
