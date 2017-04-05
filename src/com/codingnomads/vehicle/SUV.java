package com.codingnomads.vehicle;

import java.math.BigDecimal;

 /**
 * SUV Class Vehicle Returns mpg, passenger and VehicleGasCost
 */

public class SUV implements Vehicle{

    int mpg = 20;
    int passenger = 6;

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
