package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) throws ArithmeticException{

        FirstChallenge firstChallenge = new FirstChallenge();
        Double result = null;

        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Does not divide by zero!!!");
        } finally {
            System.out.println("Result: " + result);
        }
    }
}