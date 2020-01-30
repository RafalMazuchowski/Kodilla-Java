package com.kodilla.exception.test;

public class RouteNotFoundException extends IndexOutOfBoundsException {

    public RouteNotFoundException(String message) throws RouteNotFoundException {
        super(message);
        System.out.println("Airport doesn't exists");
        System.out.println("Have you ever been in Chociebuż?");
        /*FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight = new Flight(message, "Chociebuż");
        flightSearcher.findFlight(flight);*/
    }
}
