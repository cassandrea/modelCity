package com.codingnomads.business;

import java.util.ArrayList;

/**
 * Created by cass on 4/5/17.
 */
public abstract class Business {

    ArrayList businesses = new ArrayList<>();

    String type;
    boolean hasCars;
    int sqft;
    int employees;

    public void businessType(int population) {

        int numBusinesses = population / 250;

        for (int x = 0; x < numBusinesses; x++) {

            int bTypeRN = (int) (Math.random() * 99 + 1);

            if (bTypeRN < 26) { //gets hospitality

                int hTypeRN = (int) (Math.random() * 3 + 1);

                Hospitality hospitality = null;
                switch (hTypeRN) {
                    case 1:  hospitality = new Hospitality("Restaurant", 0, 25);
                        break;
                    case 2:  hospitality = new Hospitality("Hotel", 1, 35);
                        break;
                    case 3:  hospitality = new Hospitality("Bar", 0, 15);
                        break;
                }

                businesses.add(hospitality);
            }

            else if (bTypeRN < 61) { //gets retail

                int hTypeRN = (int) (Math.random() * 3 + 1);

                Hospitality hospitality = null;
                switch (hTypeRN) {
                    case 1:  hospitality = new Hospitality("Restaurant", 0, 25);
                        break;
                    case 2:  hospitality = new Hospitality("Hotel", 1, 35);
                        break;
                    case 3:  hospitality = new Hospitality("Bar", 0, 15);
                        break;
                }

                businesses.add(hospitality);
            }

            else if (bTypeRN < 91) { //gets professional

                int hTypeRN = (int) (Math.random() * 3 + 1);

                Hospitality hospitality = null;
                switch (hTypeRN) {
                    case 1:  hospitality = new Hospitality("Restaurant", 0, 25);
                        break;
                    case 2:  hospitality = new Hospitality("Hotel", 1, 35);
                        break;
                    case 3:  hospitality = new Hospitality("Bar", 0, 15);
                        break;
                }

                businesses.add(hospitality);
            }

            else { //gets industrial

                int hTypeRN = (int) (Math.random() * 3 + 1);

                Hospitality hospitality = null;
                switch (hTypeRN) {
                    case 1:  hospitality = new Hospitality("Restaurant", 0, 25);
                        break;
                    case 2:  hospitality = new Hospitality("Hotel", 1, 35);
                        break;
                    case 3:  hospitality = new Hospitality("Bar", 0, 15);
                        break;
                }

                businesses.add(hospitality);
            }
        }
    }
}

//public abstract class Business {
//
////    public void businessType(People person) {
////
////    }
//}