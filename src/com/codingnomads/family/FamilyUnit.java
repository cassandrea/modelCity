package com.codingnomads.family;

import com.codingnomads.buildings.House;

import java.util.ArrayList;
import java.util.List;

public class FamilyUnit {
    House house;
    int numPeople = 0;
    int numCars = 0;
    List<People> fam = new ArrayList<People>();

    FamilyUnit(){};

    FamilyUnit(int numOfPeople, int numOfCars, House house){
        this.house = house;
        this.numCars = numOfCars;
        this.numPeople = numOfPeople;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public int getNumCars() {
        return numCars;
    }

    public void setNumCars(int numCars) {
        this.numCars = numCars;
    }

    public List<People> getFam() {
        return fam;
    }

    public void setFam(List<People> fam) {
        this.fam = fam;
    }
}
