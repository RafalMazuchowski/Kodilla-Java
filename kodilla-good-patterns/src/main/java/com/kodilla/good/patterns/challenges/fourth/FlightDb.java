package com.kodilla.good.patterns.challenges.fourth;

import java.util.ArrayList;
import java.util.List;

public class FlightDb {
    public final static String WROCLAW = "Wroclaw";
    public final static String KRAKOW = "Krakow";
    public final static String WARSZAWA = "Warszawa";
    public final static String POZNAN = "Poznan";
    public final static String KATOWICE = "Katowice";
    private List<Flight> flights;

    public FlightDb() {
        this.flights = new ArrayList<>();
        this.flights.add(new Flight(WROCLAW, KRAKOW));
        this.flights.add(new Flight(WROCLAW, POZNAN));
        this.flights.add(new Flight(WROCLAW, WARSZAWA));
        this.flights.add(new Flight(KRAKOW, KATOWICE));
        this.flights.add(new Flight(POZNAN, KATOWICE));
        this.flights.add(new Flight(WARSZAWA, KATOWICE));
    }

    public List<Flight> getFlights() {
        return this.flights;
    }
}
