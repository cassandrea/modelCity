package com.codingnomads.business;

/**
 * Created by cass on 4/5/17.
 */
public class Hospitality extends Business {

    private String typeOfBusiness;
    private int numVehicles;
    private int numEmployees;

    public Hospitality(String typeOfBusiness, int numVehicles, int numEmployees) {
        this.typeOfBusiness = typeOfBusiness;
        this.numVehicles = numVehicles;
        this.numEmployees = numEmployees;
    }

    public String getTypeOfBusiness() {
        return typeOfBusiness;
    }

    public void setTypeOfBusiness(String typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }

    public int getNumVehicles() {
        return numVehicles;
    }

    public void setNumVehicles(int numVehicles) {
        this.numVehicles = numVehicles;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    @Override
    public String toString() {
        return "Hospitality{" +
                "typeOfBusiness='" + typeOfBusiness + '\'' +
                ", numVehicles=" + numVehicles +
                ", numEmployees=" + numEmployees +
                '}';
    }
}

//public class Hospitality extends Business {
//
//
//}