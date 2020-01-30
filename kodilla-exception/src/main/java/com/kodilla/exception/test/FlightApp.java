package com.kodilla.exception.test;

public class FlightApp {
    public static void main(String[] args) throws RouteNotFoundException {

        FlightSearcher flightSearcher = new FlightSearcher();
        Flight dummyFlight = new Flight("Denver", "Szanghaj-Pudong");
        Flight dummyFlight2 = new Flight("Warszawa", "Ad-Dammam");
        flightSearcher.findFlight(dummyFlight);
        flightSearcher.findFlight(dummyFlight2);
    }
}
