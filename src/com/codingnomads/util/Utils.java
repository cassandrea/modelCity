package com.codingnomads.util;

import java.util.Random;
/**
 * Created by ryandesmond on 4/5/17.
 */
public class Utils {

    public int randNumGenerator(int min, int max){
        Random rand = new Random();
        int  n = rand.nextInt(max) + min;
        return n;
    }

    public boolean randBoolean(){
        Random rand = new Random();
        int  n = rand.nextInt(1) + 0;
        if (n < 1)
            return false;
        else
            return true;
    }

}
