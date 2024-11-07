/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codesmell3;

/**
 *
 * @author andhik
 */
public class CodeSmell3 {

    public static void main(String[] args) {
        Order order = new Order("Bimo", "123 Main St", "bimo@example.com", "Product A", 2, 49.99);
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order);
    }
}
