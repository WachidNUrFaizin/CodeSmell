package com.mycompany.codesmell4;

public class Vehicle {
    private String type;
    private double speed;
    private double fuelLevel;

    private Accelerator accelerator;
    private Refueler refueler;
    private LocationSender locationSender;

    public Vehicle(String type, double speed, double fuelLevel) {
        this.type = type;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        this.accelerator = new Accelerator(this);
        this.refueler = new Refueler(this);
        this.locationSender = new LocationSender(this);
    }

    public Accelerator getAccelerator() {
        return accelerator;
    }

    public Refueler getRefueler() {
        return refueler;
    }

    public LocationSender getLocationSender() {
        return locationSender;
    }

    // Getter dan setter untuk type, speed, dan fuelLevel
}