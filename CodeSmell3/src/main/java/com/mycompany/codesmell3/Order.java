package com.mycompany.codesmell3;

public class Order {
    private String customerName;
    private String address;
    private String email;
    private String product;
    private int quantity;
    private double price;

    // Constructor
    public Order(String customerName, String address, String email, String product, int quantity, double price) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
