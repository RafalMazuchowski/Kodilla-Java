package com.kodilla.exception.test;

import java.util.HashMap;

public class AirportsDatabase {
    public HashMap<String, Boolean> airports(){
        HashMap<String, Boolean> airportsList = new HashMap();
        airportsList.put("Ad-Dammam", true);
        airportsList.put("Denver", true);
        airportsList.put("Dallas-Fort Worth", true);
        airportsList.put("Szanghaj-Pudong", true);
        airportsList.put("Paryż-Roissy-Charles de Gaulle", true);
        airportsList.put("Chociebuż", false);
        return airportsList;
    }
}
