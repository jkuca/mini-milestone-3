package org.example.Vehicle;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Bus extends Vehicle {

    FuelType fuelType = FuelType.GAS;
    private int polutionIndicator;

    LocalDate dateNow = LocalDate.now();

    public Bus(int ID, int plateNumber, int maxCapacityOfPassangers, Status status,  LocalDate lastServiceDate, int polutionIndicator){
        super(ID, plateNumber,maxCapacityOfPassangers, status, lastServiceDate);
        this.polutionIndicator = polutionIndicator;
        whatStatusShouldbe();

    }

    public void whatStatusShouldbe(){
        LocalDate lastServiceDatePlus6Months = lastServiceDate.plusMonths(6);
        if (dateNow.isBefore(lastServiceDatePlus6Months) && polutionIndicator > 5){
            status = Status.IN_OPERATION;
        }
        LocalDate lastServiceDatePlus12Months = lastServiceDate.plusMonths(12);
        if (dateNow.isBefore(lastServiceDatePlus12Months) && polutionIndicator >= 3 && polutionIndicator <= 5){
            status = Status.NEED_REPAIR;
        }
        else status = Status.FOR_SCRAP;
    }
}
