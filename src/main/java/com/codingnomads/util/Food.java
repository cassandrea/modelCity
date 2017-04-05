package main.java.com.codingnomads.util;

import java.math.BigDecimal;

/**
 /*how many lbs of food types based on calories needed and cost per pound
 meat 600 cal/lb - x = 10%, cost = $5
 vegetables 300 cal/lb - x = 20%, cost = $1
 fruit 400 cal/lb - x = 20%, cost = $2
 grain 1000 cal/lb - x = 40%, cost = $0.50
 dairy 500 cal/lb - x = 10%, cost = $3

 for every 100 calories, x% will come from each type
 based on the number of calories needed, determine how many pounds of each type is needed

 */
public class Food {

    final BigDecimal meat_price = new BigDecimal(5.00);
    final BigDecimal vegetable_price = new BigDecimal(1.00);
    final BigDecimal fruit_price = new BigDecimal(2.00);
    final BigDecimal grain_price = new BigDecimal(0.50);
    final BigDecimal dairy_price = new BigDecimal(3.00);
    final int meat_cal = 600;
    final int vegetable_cal = 300;
    final int fruit_cal = 400;
    final int grain_cal = 1000;
    final int dairy_cal = 500;


    // Below are methods for price per pound

    public BigDecimal getMeat_price() {
        return meat_price;
    }

    public BigDecimal getVegetable_price() {
        return vegetable_price;
    }

    public BigDecimal getFruit_price() {
        return fruit_price;
    }

    public BigDecimal getGrain_price() {
        return grain_price;
    }

    public BigDecimal getDairy_price() {
        return dairy_price;
    }

    // Below are methods for calories per pound
    public int getMeat_cal() {
        return meat_cal;
    }

    public int getVegetable_cal() {
        return vegetable_cal;
    }

    public int getFruit_cal() {
        return fruit_cal;
    }

    public int getGrain_cal() {
        return grain_cal;
    }

    public int getDairy_cal() {
        return dairy_cal;
    }

}

