/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codesmell3;

/**
 *
 * @author andhik
 */
public class OrderProcessor {
     public void processOrder(Order order) {
        // Logika pemrosesan pesanan menggunakan data dari objek Order
        String customerName = order.getCustomerName();
        String address = order.getAddress();
        String email = order.getEmail();
        String product = order.getProduct();
        int quantity = order.getQuantity();
        double price = order.getPrice();

        // Logika pemrosesan pesanan
        System.out.println("Processing order for: " + customerName);
    }
}

