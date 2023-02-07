package org.example.Vehicle;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Tram extends Vehicle {

    FuelType fuelType = FuelType.ELECTRIC;
    private int yearsInService;

    public Tram(int ID, int plateNumber, int maxCapacityOfPassangers, Status status, int yearsInService,  LocalDate stringDateServie) {
        super(ID, plateNumber, maxCapacityOfPassangers, status, stringDateServie);
        this.yearsInService = yearsInService;
    }
}
