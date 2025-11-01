package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;
    private int length = 0;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
        length += 1;
    }

    

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void delete(City city){
        for (int i = 0 ; i < length; ++i){
            if ((cities.get(i).getCityName().compareTo(city.getCityName()) == 0) && (cities.get(i).getProvinceName().compareTo(city.getProvinceName()) == 0)) {
                cities.remove(i);
                length = length - 1;
                return;
            }
        }
        throw new IllegalArgumentException(); // If it doesn't return in the for loop, this happens
}
    public int countCities(){
        return length;
    }
}
// Testing Testing 123