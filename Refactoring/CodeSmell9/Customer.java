package com.mycompany.codesmell9;

/**
 * Represents a customer with personal and contact information.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    // Constructor to initialize a Customer object
    public Customer(String firstName, String lastName, String address, String city, String state, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getter and Setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // Method to get the full name of the customer
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Method to get the full address of the customer
    public String getFullAddress() {
        return address + ", " + city + ", " + state + " " + zipCode;
    }

    // Method to check if the customer is located in a specific state
    public boolean isLocatedInState(String state) {
        return this.state.equalsIgnoreCase(state);
    }
}