package com.kodilla.good.patterns.challenges.fourth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsFinder implements FlightFinderService {
    private FlightDb flightDb;

    public FlightsFinder(FlightDb flightDb) {
        this.flightDb = flightDb;
    }

    @Override
    public List<Flight> findFrom(String from) {
        return flightDb.getFlights().stream()
                .filter(flight -> flight.getFrom().equals(from))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findTo(String to) {
        return flightDb.getFlights().stream()
                .filter(flight -> flight.getTo().equals(to))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findIndirect(String from, String to) {
        List<Flight> result = new ArrayList<>();
        flightDb.getFlights().stream()
                .filter(flight -> flight.getFrom().equals(from))
                .forEach(flight -> {
                    flightDb.getFlights().stream()
                            .filter(flightTo -> flightTo.getFrom().equals(flight.getFrom()) && flightTo.getTo().equals(to))
                            .forEach(flight1 -> {
                                System.out.println(flight);
                                System.out.println(flight1);
                            });
                });
        return result;
    }
}
