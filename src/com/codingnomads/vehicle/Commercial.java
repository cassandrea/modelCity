package com.codingnomads.vehicle;

import java.math.BigDecimal;


/**
 * Commercial Class Vehicle Returns mpg, passenger and VehicleGasCost
 * */


public class Commercial implements Vehicle{
    int mpg = 10;
    int passenger = 1;

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
