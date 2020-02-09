package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class StatisticCounterTestSuite {
    @Test
    public void testZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Poul");
        usersList.add("Kriss");
        usersList.add("Stefan");
        usersList.add("Atrii");
        given(statisticsMock.usersNames()).willReturn(usersList);
        given(statisticsMock.postsCount()).willReturn(0);
        given(statisticsMock.commentsCount()).willReturn(10);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        double postsAtUser = statisticsCounter.getPostsAtUser();
        Double commentsAtPost = statisticsCounter.getCommentsAtPost();

        //Then
        Assert.assertNotNull(postsAtUser);
        Assert.assertEquals(postsAtUser, 0, 0.1);
        Assert.assertNull(commentsAtPost);
    }

    @Test
    public void testPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Poul");
        usersList.add("Kriss");
        usersList.add("Stefan");
        usersList.add("Atrii");
        given(statisticsMock.usersNames()).willReturn(usersList);
        given(statisticsMock.postsCount()).willReturn(1000);
        given(statisticsMock.commentsCount()).willReturn(4000);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        double postsAtUser = statisticsCounter.getPostsAtUser();
        double commentsAtPost = statisticsCounter.getCommentsAtPost();

        //Then
        Assert.assertNotNull(postsAtUser);
        Assert.assertEquals(postsAtUser, 250, 0.1);
        Assert.assertEquals(commentsAtPost, 4, 0.1);
    }

    @Test
    public void testZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Poul");
        usersList.add("Kriss");
        usersList.add("Stefan");
        usersList.add("Atrii");
        given(statisticsMock.usersNames()).willReturn(usersList);
        given(statisticsMock.postsCount()).willReturn(1000);
        given(statisticsMock.commentsCount()).willReturn(0);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        double commentsAtUser = statisticsCounter.getCommentsAtUser();
        double commentsAtPost = statisticsCounter.getCommentsAtPost();

        //Then
        Assert.assertNotNull(commentsAtUser);
        Assert.assertNotNull(commentsAtPost);
        Assert.assertEquals(commentsAtUser, 0, 0);
        Assert.assertEquals(commentsAtPost, 0, 0);
    }

    @Test
    public void testLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Poul");
        usersList.add("Kriss");
        usersList.add("Stefan");
        usersList.add("Atrii");
        given(statisticsMock.usersNames()).willReturn(usersList);
        given(statisticsMock.postsCount()).willReturn(1000);
        given(statisticsMock.commentsCount()).willReturn(100);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        double commentsAtPost = statisticsCounter.getCommentsAtPost();

        //Then
        Assert.assertNotNull(commentsAtPost);
        Assert.assertEquals(commentsAtPost, 0.1, 0.1);
    }

    @Test
    public void testMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Poul");
        usersList.add("Kriss");
        usersList.add("Stefan");
        usersList.add("Atrii");
        given(statisticsMock.usersNames()).willReturn(usersList);
        given(statisticsMock.postsCount()).willReturn(1000);
        given(statisticsMock.commentsCount()).willReturn(10000);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        double commentsAtPost = statisticsCounter.getCommentsAtPost();

        //Then
        Assert.assertNotNull(commentsAtPost);
        Assert.assertEquals(commentsAtPost, 10, 0.1);
    }

    @Test
    public void testZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        given(statisticsMock.usersNames()).willReturn(usersList);
        given(statisticsMock.postsCount()).willReturn(100);
        given(statisticsMock.commentsCount()).willReturn(10);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsAtUser = statisticsCounter.getPostsAtUser();
        Double commentsAtUser = statisticsCounter.getCommentsAtUser();

        //Then
        Assert.assertNull(postsAtUser);
        Assert.assertNull(commentsAtUser);
    }

    @Test
    public void testUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("Kriss");
        }
        given(statisticsMock.usersNames()).willReturn(usersList);
        given(statisticsMock.postsCount()).willReturn(100);
        given(statisticsMock.commentsCount()).willReturn(1000);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsAtUser = statisticsCounter.getPostsAtUser();
        Double commentsAtUser = statisticsCounter.getCommentsAtUser();

        //Then
        Assert.assertNotNull(postsAtUser);
        Assert.assertNotNull(commentsAtUser);
        Assert.assertEquals(postsAtUser, 1, 0.1);
        Assert.assertEquals(commentsAtUser, 10, 0.1);
    }
}

