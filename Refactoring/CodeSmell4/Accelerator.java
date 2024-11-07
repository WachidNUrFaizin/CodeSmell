package com.mycompany.codesmell4;

public class Accelerator {
    private Vehicle vehicle;

    public Accelerator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void accelerate() {
        // Logika akselerasi
        System.out.println("Accelerating the vehicle.");
    }
}