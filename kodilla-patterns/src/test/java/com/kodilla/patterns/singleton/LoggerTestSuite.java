package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog(){
        //Given
        Logger logger = Logger.getInstance();
        logger.log("Good time for study");
        logger.log("If I don't move I'll be fat");
        //When
        String storedLog = logger.getLastLog();
        //Then
        Assert.assertEquals("If I don't move I'll be fat", storedLog);
    }
}
