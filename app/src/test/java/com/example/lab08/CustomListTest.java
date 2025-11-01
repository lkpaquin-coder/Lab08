package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testDelete() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "Alberta"); // Creates identical city as is in list
        list.addCity(city);
        list.delete(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    void testCountCitiesEmpty() {
        CustomList list = new CustomList();
        int testing = list.countCities(); //Tests empty list
        assertEquals(0, testing);
        City city = new City("Edmonton", "Alberta"); // Creates identical city as is in list
        list.addCity(city);
        int testingOne = list.countCities(); //Tests non-empty list
        assertEquals(1, testingOne);
    }

}