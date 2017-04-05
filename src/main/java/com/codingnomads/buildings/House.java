package main.java.com.codingnomads.buildings;

import main.java.com.codingnomads.buildings.kitchen.Kitchen;

/**
 * Created by cass on 4/5/17.
 */
public abstract class House {
    int rooms;
    double sqFootage;
    Kitchen kitchen;

    public abstract int getRooms();

    public abstract double getSqFootage();

    public abstract Kitchen getKitchen();
}
