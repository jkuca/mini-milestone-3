package org.example;

import org.example.Vehicle.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Trolleybus trolleybus1 = new Trolleybus(1, 123, 30, Status.IN_OPERATION, LocalDate.parse("2022-01-01"));
        Bus bus1 = new Bus(1, 1212, 50, Status.NEED_REPAIR, LocalDate.parse("2023-01-12"), 12);
        Tram tram = new Tram(1, 456, 40, Status.IN_OPERATION, 21 ,LocalDate.parse("2022-01-01"));

        List<Vehicle> allVehicles = new ArrayList<Vehicle>();

        allVehicles.add(bus1);
        allVehicles.add(tram);
        allVehicles.add(trolleybus1);




    }
}
