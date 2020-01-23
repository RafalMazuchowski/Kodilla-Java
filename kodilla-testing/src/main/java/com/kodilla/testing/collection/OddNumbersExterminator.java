package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (Integer odd :numbers) {
            if(odd%2 == 1)
            evenNumbers.add(odd);
        }
        return evenNumbers;
    }
}
