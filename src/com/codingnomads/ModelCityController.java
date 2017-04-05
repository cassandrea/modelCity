package com.codingnomads;

import com.codingnomads.family.FamilyUnit;
import com.codingnomads.family.PeopleController;
import com.codingnomads.family.People;
import java.util.ArrayList;

/**
 * Created by cass on 4/5/17.
 */
public class ModelCityController {
    public static void main(String[] args) {

        /*
        take in population
        create city, people, houses, businesses, jobs, and vehicles
        return values of people, houses, businesses, jobs, and vehicles
        calculate utilities and food

         */

        ModelCityController cityController = new ModelCityController();
        cityController.start(args[0]);

    }

    public void start(String pop){
        int population = Integer.valueOf(pop);
        ArrayList<FamilyUnit> fu;
        ArrayList<People> grownFolks;
        ArrayList<People> oldFolks;
        ArrayList<People> tinyFolks;
        PeopleController peopleController = new PeopleController(population);

        fu = peopleController.getFamilyUnitArrayList();
        System.out.println(fu.size());

        grownFolks = peopleController.getAdultsArrayList();
        oldFolks = peopleController.getSeniorsArrayList();
        tinyFolks = peopleController.getInfantsAndChildrenArrayList();

        int fuIndex = 0;
        int babyIndex = 0;
        int seniorIndex = 0;
        int peopleIndex = 0;
        ArrayList<People> fam;

        for (fuIndex = 0; fuIndex < fu.size(); fuIndex++){
            fam = new ArrayList<People>();
            if (fu.get(fuIndex).getNumPeople() == 1) {
                fam.add(grownFolks.get(peopleIndex));
                fu.get(fuIndex).setFam(fam);
                peopleIndex++;
            } else if (fu.get(fuIndex).getNumPeople() == 2){
                    fam.add(grownFolks.get(peopleIndex));
                    fam.add(grownFolks.get(peopleIndex));
                    peopleIndex++;
                    peopleIndex++;
            } else if (fu.get(fuIndex).getNumPeople() == 3){
                fam.add(grownFolks.get(peopleIndex));
                peopleIndex++;
                fam.add(grownFolks.get(peopleIndex));
                peopleIndex++;
                fam.add(tinyFolks.get(babyIndex));
                babyIndex++;
            } else if (fu.get(fuIndex).getNumPeople() == 4){
                fam.add(grownFolks.get(peopleIndex));
                peopleIndex++;
                fam.add(grownFolks.get(peopleIndex));
                peopleIndex++;
                fam.add(tinyFolks.get(babyIndex));
                babyIndex++;
                fam.add(tinyFolks.get(babyIndex));
                babyIndex++;
            }
        }

        System.out.println("Adults with houses: " + peopleIndex);
        System.out.println("Babies in houses: " + babyIndex);


    }
}
