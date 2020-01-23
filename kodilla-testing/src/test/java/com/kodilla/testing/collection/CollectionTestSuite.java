package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList () {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        exterminator.exterminate(emptyList);
        //When
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(emptyList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> filledList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++){
            filledList.add(i);
        }
        System.out.println("Filled: " + filledList);
        exterminator.exterminate(filledList);
        //When
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(filledList);
        System.out.println("Testing " + result);
        //Then
        ArrayList<Integer> filledOddList = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i=i+2){
            filledOddList.add(i);
        }
        System.out.println("Filled: " + filledOddList);
        Assert.assertEquals(filledOddList, result);
    }
}