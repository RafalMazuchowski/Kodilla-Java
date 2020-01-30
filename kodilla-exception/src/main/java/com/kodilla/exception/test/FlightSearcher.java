package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearcher {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        AirportsDatabase airportsDatabase = new AirportsDatabase();
        HashMap<String, Boolean> airports = airportsDatabase.airports();
        if (!airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException(flight.getDepartureAirport());
        }
        if (!airports.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException(flight.getArrivalAirport());
        } else {
            System.out.println("Fly salefly from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        }
    }
}
