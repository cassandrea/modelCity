package com.codingnomads.buildings;

/**
 * Created by celie on 05/04/17.
 */
public class BuildingController {
    int totalPeople;
    double onePerson;
    double twoPeople;
    double threePeople;
    double fourPeople;

    BuildingController(int totalPeople){
        this.totalPeople = totalPeople;
        onePerson = totalPeople * .3;
        twoPeople = totalPeople * .2;
        threePeople = totalPeople * .3;
        fourPeople = totalPeople * .2;
    }
}
