package com.kodilla.good.patterns.challenges.fourth;

import java.util.List;

public interface FlightFinderService {
    List<Flight> findFrom (String from);
    List<Flight> findTo(String to);
    List<Flight> findIndirect(String from, String to);
}
