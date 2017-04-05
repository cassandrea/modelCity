package main.java.com.codingnomads.vehicle;

import java.math.BigDecimal;

/**
 * Created by nhavinh on 4/5/17.
 */

public class VehicleUtil {

    public BigDecimal calculateVehicleGasCost(double distanceTravel, BigDecimal pricePerGallon, double mpg) {
        double gallonsNeeded = distanceTravel/mpg;
        BigDecimal gallons = new BigDecimal(gallonsNeeded);
        BigDecimal cost = gallons.multiply(pricePerGallon);
        return cost;
    }
}
