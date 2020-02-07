package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .map(s -> {
                    System.out.println(s);
                    return s;
                })
                .average().getAsDouble();
        return average;
    }
}