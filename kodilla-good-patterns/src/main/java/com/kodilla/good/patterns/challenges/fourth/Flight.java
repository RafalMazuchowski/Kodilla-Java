package com.kodilla.good.patterns.challenges.fourth;

import java.util.Objects;

public class Flight {
    protected String from;
    protected String to;


    public Flight(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return getFrom().equals(flight.getFrom()) && getTo().equals(flight.getTo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
