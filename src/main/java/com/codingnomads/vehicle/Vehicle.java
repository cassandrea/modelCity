package main.java.com.codingnomads.vehicle;

import java.math.BigDecimal;

/**
 * Created by cass on 4/5/17.
 */
public interface Vehicle {

    int getMpg();
    int getPassenger();
    BigDecimal calculateVehicleGasCost(double distanceTravel, BigDecimal pricePerGallon);

}
