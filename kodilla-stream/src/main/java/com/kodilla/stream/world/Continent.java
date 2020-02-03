package com.kodilla.stream.world;

import java.util.List;

public final class Continent {

    private final String continentName;
    private final List<Country> countries;

    public Continent(String continentName, List<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        for (Country country : countries){
            countries.add(new Country(country.getCountryName(),
                    country.getPeopleQuantity()));
        }
        return countries;
    }
}
