package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countriesEU = new ArrayList<>();
        //population per day (February 1, 2020)
        countriesEU.add(new Country("Poland", new BigDecimal("37727512")));
        countriesEU.add(new Country("German", new BigDecimal("82273584")));
        countriesEU.add(new Country("France", new BigDecimal("67893953")));
        List<Country> countriesAsia = new ArrayList<>();
        countriesAsia.add(new Country("China", new BigDecimal("1396819852")));
        countriesAsia.add(new Country("Cyprus", new BigDecimal("1207789")));
        countriesAsia.add(new Country("India", new BigDecimal("1384445123")));
        List<Country> countriesNA = new ArrayList<>();
        countriesNA.add(new Country("Canada", new BigDecimal("37585214")));
        countriesNA.add(new Country("USA", new BigDecimal("332982164")));
        countriesNA.add(new Country("Mexico", new BigDecimal("134002734")));

        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Europe", countriesEU));
        continents.add(new Continent("Asia", countriesAsia));
        continents.add(new Continent("North America", countriesNA));

        World world = new World("Earth", continents);

        //When
        BigDecimal humanity = world.getPeopleQuantity();
        System.out.println("SIZE: " + humanity);

        //Then
        BigDecimal expectedPeople = new BigDecimal("3474937925"); //3.47 B
        System.out.println("Then: " + expectedPeople + " " + humanity);
        Assert.assertEquals(expectedPeople, humanity);

    }
}
