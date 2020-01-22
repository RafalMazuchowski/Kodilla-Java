package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        int a = 7;
        int b = 3;
        Calculator calculator = new Calculator(a, b);

        String result = simpleUser.getUsername();
        System.out.print("getUsername test: ");
        if (result.equals("theForumUser")) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }

        int calcResult = calculator.add(a, b);
        System.out.print("add test: ");
        if (calcResult == 10) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }

        calcResult = calculator.subtract(a, b);
        System.out.print("subtract test: ");
        if (calcResult == 3) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }
    }
}