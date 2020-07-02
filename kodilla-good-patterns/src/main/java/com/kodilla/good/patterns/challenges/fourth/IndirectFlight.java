package com.kodilla.good.patterns.challenges.fourth;

import java.util.Objects;

public class IndirectFlight extends Flight{
    private String via;

    public IndirectFlight(String from, String to, String via) {
        super(from, to);
        this.via = via;
    }

    public String getVia() {
        return via;
    }

    @Override
    public String toString() {
        return "IndirectFlight{" +
                "from='" + from + '\'' +
                ", via='" + via + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IndirectFlight that = (IndirectFlight) o;
        return Objects.equals(via, that.via);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), via);
    }
}
