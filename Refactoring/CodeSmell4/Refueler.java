package com.mycompany.codesmell4;

public class Refueler {
    private Vehicle vehicle;

    public Refueler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void refuel() {
        // Logika isi bahan bakar
        System.out.println("Refueling the vehicle.");
    }
}