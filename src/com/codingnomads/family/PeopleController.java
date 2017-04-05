package com.codingnomads.family;

import java.util.ArrayList;

import com.codingnomads.buildings.Apartment;
import com.codingnomads.buildings.SingleFamily;

public class PeopleController {

    int population = 0;//population is the number that is input from the console
    double sngls = population * .3;//calculating number of 1 person family units
    double dbls = population * ((.2)/(2));//calculating the number of 2 person family units
    double trpls = population * ((.3)/(3));//calculating the number of 3 person family units
    double qds = population * ((.2)/(4));//calculating the number of 4 person family units

    public void controllerMethod() {
        ArrayList<FamilyUnit> fu = new ArrayList<FamilyUnit>();//creating list of family units

        for (int singles = 0; singles < sngls; singles++) {//iterates through every 1 person family unit
            fu.add(new FamilyUnit(1, 1, new Apartment()));
        }//assigns values from family unit constructor

        for (int doubles = 0; doubles < dbls; doubles++) {//iterates through every 2 person family unit
            fu.add(new FamilyUnit(2, 1, new Apartment()));
        }//assigns values from family unit constructor

        for (int triples = 0; triples < trpls; triples++) {//iterates through every 3 person family unit
            fu.add(new FamilyUnit(3, 1, new SingleFamily()));
        }//assigns values from family unit constructor

        for (int quads = 0; quads < qds; quads++) {//iterates through every 4 person family unit
            fu.add(new FamilyUnit(4, 1, new SingleFamily()));
        }//assigns values from family unit constructor
    }
}