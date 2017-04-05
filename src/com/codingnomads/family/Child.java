package com.codingnomads.family;

/**
 * Created by cass on 4/5/17.
 */
public class Child extends People {
    private int calories;
    private int sqFt = 500;
    private boolean isMale;


    public Child(boolean isMale){
        this.isMale = isMale;
        setCalories();
    }

    //implement calories() from people class
    public void setCalories(){
        if (isMale()){
            calories = 2000;
        } else calories = 1500;
    }

    //implement isMale() form people class
    public boolean isMale(){

        return isMale;
    }

    public int getCalories() {
        return calories;
    }

    public int getSqFt() {
        return sqFt;
    }
}