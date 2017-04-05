package com.codingnomads.family;

/**
 * Created by cass on 4/5/17.
 */
public class Adult extends People {
    private int calories;
    private int sqFt = 1500;
    private boolean isMale;
    private boolean isEmployed;

    public Adult(boolean isMale) {
        this.isMale = isMale;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories() {
        if (isMale)
            this.calories = 2500;
        else
            this.calories = 2000;
    }

    public int getSqFt() {
        return sqFt;
    }

    @Override
    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }
}