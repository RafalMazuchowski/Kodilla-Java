package com.kodilla.good.patterns.challenges.fourth;

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
    public List<IndirectFlight> findIndirect(String from, String to) {
        return flightDb.getFlights().stream()
                .filter(flight -> flight.getFrom().equals(from))
                .flatMap(flight -> flightDb.getFlights().stream()
                        .filter(f -> f.getFrom().equals(flight.getTo()))
                        .map(f -> new IndirectFlight(flight.getFrom(), f.getTo(), flight.getTo())))
                .filter(flight1 -> flight1.getTo().equals(to))
                .collect(Collectors.toList());
    }
}