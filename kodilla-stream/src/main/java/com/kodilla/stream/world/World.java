package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {

    private final String worldName;
    private final List<Continent> continents;

    public World(String worldName, List<Continent> continents) {
        this.worldName = worldName;
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }

    public List<Continent> getContinents() {
        for (Continent continent : continents){
            continents.add(new Continent(continent.getContinentName(), continent.getCountries()));
        }
        return continents;
    }
}
