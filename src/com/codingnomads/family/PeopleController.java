package com.codingnomads.family;

import java.util.ArrayList;

import com.codingnomads.buildings.Apartment;
import com.codingnomads.buildings.SingleFamily;
import com.codingnomads.util.Utils;

public class PeopleController {

    int population;
    double sngls;
    double dbls;
    double trpls;
    double qds;

    int infants;
    int children;
    int adults;
    int seniors;

    public PeopleController(int population){
        this.population = population;
        sngls = population * .3;//calculating number of 1 person family units
        dbls = (population * .2) / 2;//calculating the number of 2 person family units
        trpls = (population * .3) /3;//calculating the number of 3 person family units
        qds = (population * .2) / 4;//calculating the number of 4 person family units

        infants = (int) (population * .07);
        children = (int) (population * .18);
        adults = (int) (population * .54);
        seniors = (int) (population * .21);

    }

    public ArrayList<FamilyUnit> getFamilyUnitArrayList() {
        ArrayList<FamilyUnit> fu = new ArrayList<FamilyUnit>();//creating list of family units
        int singleCount = 0;
        int doubleCount = 0;
        int tripleCount = 0;
        int quadCount = 0;


        for (int singles = 0; singles < sngls; singles++) {//iterates through every 1 person family unit
            fu.add(new FamilyUnit(1, 1, new Apartment()));
            singleCount++;
        }//assigns values from family unit constructor

        for (int doubles = 0; doubles < dbls; doubles++) {//iterates through every 2 person family unit
            fu.add(new FamilyUnit(2, 1, new Apartment()));
            doubleCount++;
        }//assigns values from family unit constructor

        for (int triples = 0; triples < trpls; triples++) {//iterates through every 3 person family unit
            fu.add(new FamilyUnit(3, 1, new SingleFamily()));
            tripleCount++;
        }//assigns values from family unit constructor

        for (int quads = 0; quads < qds; quads++) {//iterates through every 4 person family unit
            fu.add(new FamilyUnit(4, 2, new SingleFamily()));
                quadCount++;
        }//assigns values from family unit constructor

        System.out.println("singles = " + singleCount);
        System.out.println("double = " + doubleCount);
        System.out.println("triples = " + tripleCount);
        System.out.println("quads = " + quadCount);

        return fu;
    }

    public ArrayList<People> getAdultsArrayList() {
        Utils util = new Utils();
        int adultCount = 0;


        ArrayList<People> grownFolks = new ArrayList<People>();//creating list of family units

        for (int i = 0; i < adults; i++) {//iterates through every 1 person family unit
            grownFolks.add(new Adult(util.randBoolean()));
            adultCount++;
        }

        System.out.println("adults = " + adultCount);


        return grownFolks;
    }

    public ArrayList<People> getSeniorsArrayList() {
        Utils util = new Utils();
        int seniorCount = 0;


        ArrayList<People> oldFolks = new ArrayList<People>();//creating list of family units

        for (int i = 0; i < seniors; i++) {//iterates through every 1 person family unit
            oldFolks.add(new Senior(util.randBoolean()));
            seniorCount++;
        }

        System.out.println("seniors = " + seniorCount);

        return oldFolks;
    }

    public ArrayList<People> getInfantsAndChildrenArrayList() {
        Utils util = new Utils();
        int infantCount = 0;
        int childCount = 0;

        ArrayList<People> tinyFolks = new ArrayList<People>();//creating list of family units


        for (int i = 0; i < infants; i++) {//iterates through every 1 person family unit
            tinyFolks.add(new Infant(util.randBoolean()));
            infantCount++;
        }//assigns values from family unit constructor

        for (int i = 0; i < children; i++) {//iterates through every 1 person family unit
            tinyFolks.add(new Child(util.randBoolean()));
            childCount++;
        }

        System.out.println("infants = " + infantCount);
        System.out.println("children = " + childCount);

        return tinyFolks;
    }
}