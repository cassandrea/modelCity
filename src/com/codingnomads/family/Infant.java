package com.codingnomads.family;

/**
 * Created by cass on 4/5/17.
 */
public class Infant extends People{
    private int calories;
    private int sqFt = 200;
    private boolean isMale;

    public Infant(boolean isMale){
        this.isMale = isMale;
        setCalories();
    }

    //implement calories() from people class
    public void setCalories(){
        this.calories = calories;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;

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