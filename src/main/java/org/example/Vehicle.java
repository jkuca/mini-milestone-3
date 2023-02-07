package org.example.Vehicle;

import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class Vehicle {

    private final int ID;

    private final int plateNumber;

    private final int maxCapacityOfPassangers;

    Status status;

    LocalDate lastServiceDate;



    public Vehicle(int ID, int plateNumber, int maxCapacityOfPassangers, Status status, LocalDate lastServiceDate){
        this.lastServiceDate = lastServiceDate;
        this.plateNumber = plateNumber;
        this.ID = ID;
        this.maxCapacityOfPassangers = maxCapacityOfPassangers;
        this.status = status;

    }

}
