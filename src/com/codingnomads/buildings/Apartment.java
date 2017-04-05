package com.codingnomads.buildings;

import com.codingnomads.buildings.kitchen.Kitchen;

/**
 * Created by cass on 4/5/17.
 */
public class Apartment extends House {
    int rooms = 2;
    double sqFootage = 1200;
    Kitchen kitchen;

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
