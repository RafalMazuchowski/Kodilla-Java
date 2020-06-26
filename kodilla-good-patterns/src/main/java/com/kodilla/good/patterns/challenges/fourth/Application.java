package com.kodilla.good.patterns.challenges.fourth;

import static com.kodilla.good.patterns.challenges.fourth.FlightDb.KATOWICE;
import static com.kodilla.good.patterns.challenges.fourth.FlightDb.WROCLAW;


public class Application {
    public static void main(String[] args) {
        FlightDb flightDb = new FlightDb();

        FlightFinderService flightFinderService = new FlightsFinder(flightDb);

        System.out.println("Flights from Wroclaw");
        flightFinderService.findFrom(WROCLAW)
        .forEach(System.out::println);

        System.out.println("Flights to Katowice");
        flightFinderService.findTo(KATOWICE)
        .forEach(System.out::println);

        System.out.println("Indirect flights from Wroclaw to Katowice");
        flightFinderService.findIndirect(WROCLAW, KATOWICE)
        .forEach(System.out::println);
    }
}
