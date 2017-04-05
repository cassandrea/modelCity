package main.java.com.codingnomads.family;

/**
 * Created by cass on 4/5/17.
 */
public class Child extends People {
    private int calories;
    private int sqFt;
    private boolean isMale;
    private int population;

    //implement calories() from people class
    public void setCalories(int calories){
        if (isMale()){
            calories = 2000;
        } else calories = 1500;
    }

    //implement sqFtperPerson() from people class
    public void sqFtperPerson(int sqFt) {
        sqFt = 500;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;

    }
    //implement isMale() form people class
    public boolean isMale(){

        return isMale;
    }

}
