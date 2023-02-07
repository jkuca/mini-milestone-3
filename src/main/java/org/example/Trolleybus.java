package org.example.Vehicle;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Trolleybus extends Vehicle {

    FuelType secondFuelTypel = FuelType.ELECTRIC;
    FuelType fuelType = FuelType.HYBRID;

    public Trolleybus(int ID, int plateNumber, int maxCapacityOfPassangers, Status status, LocalDate lastServiceDate) {
        super(ID, plateNumber, maxCapacityOfPassangers, status, lastServiceDate);

    }
}
