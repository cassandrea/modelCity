package com.codingnomads.util;

import java.math.BigDecimal;

/**
 * Utilities Class
 * All utilities is priced per square foot, except for vehicleGas which is priced per gallon
 *
 */

public class Utilities {

    final BigDecimal natgas_price = new BigDecimal(5.00);
    final BigDecimal electric_price = new BigDecimal(1.00);
    final BigDecimal water_price = new BigDecimal(3.00);
    final BigDecimal sewer_price = new BigDecimal(0.50);
    final BigDecimal vehicleGas_price = new BigDecimal(2.00);

    // Below are methods for price per unit

    public BigDecimal getNatgas_price() {
        return natgas_price;
    }

    public BigDecimal getElectric_price() {
        return electric_price;
    }

    public BigDecimal getWater_price() {
        return water_price;
    }

    public BigDecimal getSewer_price() {
        return sewer_price;
    }

    public BigDecimal getVehicleGas_price() {
        return vehicleGas_price;
    }

    // Below are methods for total price

    public BigDecimal getNatgas_price_total(double squareFeet) {
        return natgas_price.multiply(new BigDecimal(squareFeet));
    }

    public BigDecimal getElectric_price_total(double squareFeet) {
        return electric_price.multiply(new BigDecimal(squareFeet));
    }

    public BigDecimal getWater_price_total(double squareFeet) {
        return water_price.multiply(new BigDecimal(squareFeet));
    }

    public BigDecimal getSewer_price_total(double squareFeet) {
        return sewer_price.multiply(new BigDecimal(squareFeet));
    }

    public BigDecimal getVehicleGas_price_total(double gallons) {
        return vehicleGas_price.multiply(new BigDecimal(gallons));
    }
}
