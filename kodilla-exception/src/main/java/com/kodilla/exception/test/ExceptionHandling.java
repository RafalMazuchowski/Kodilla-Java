package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 1.5;
        double y = 1;

        try {
            secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            if (x >= 2 || x < 1) System.out.println("X must be in range \"(1 ; 2>\"");
            if (y == 1.5) System.out.println("Y can not be 1.5");
            else System.out.println("Wrong X or Y");
        } finally {
            System.out.println("X: " + x + ", Y: " + y);
        }
    }
}
