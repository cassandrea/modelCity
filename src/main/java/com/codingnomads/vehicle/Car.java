package main.java.com.codingnomads.vehicle;

import java.math.BigDecimal;

/**
 * Car Class Vehicle Returns mpg, passenger and VehicleGasCost
 */
public class Car implements Vehicle {
    int mpg = 30;
    int passenger = 4;

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
