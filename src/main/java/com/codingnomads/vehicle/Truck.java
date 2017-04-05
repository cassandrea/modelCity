package main.java.com.codingnomads.vehicle;

import java.math.BigDecimal;

/**
 * Truck Class Vehicle Returns mpg, passenger and VehicleGasCost
 */


public class Truck implements Vehicle{
    int mpg = 15;
    int passenger = 2;

    public int getMpg() {
        return mpg;
    }

    public int getPassenger() {
        return passenger;
    }

    public BigDecimal calculateVehicleGasCost(double distanceTravel, BigDecimal pricePerGallon) {
        VehicleUtil util = new VehicleUtil();
        //below object.method returns BigDecimal VehicleGasCost
        return util.calculateVehicleGasCost(distanceTravel, pricePerGallon, mpg);
    }
}
