package main.java.com.codingnomads.buildings;

import main.java.com.codingnomads.buildings.kitchen.Kitchen;

/**
 * Created by cass on 4/5/17.
 */
public class Apartment extends House {

    @Override
    public int getRooms() {
        return rooms;
    }

    @Override
    public double getSqFootage() {
        return sqFootage;
    }

    @Override
    public Kitchen getKitchen() {
        return kitchen;
    }
}
