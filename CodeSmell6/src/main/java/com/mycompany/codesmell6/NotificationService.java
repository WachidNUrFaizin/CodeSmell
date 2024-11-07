/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codesmell6;

/**
 *
 * @author andhik
 */
public class NotificationService {
    public void sendNotification(String type) {
        switch (type) {
            case "SMS":
                // Kirim SMS
                break;
            case "EMAIL":
                // Kirim Email
                break;
            case "PUSH":
                // Kirim Push Notification
                break;
            default:
                throw new IllegalArgumentException("Type not supported");
        }
    }
}
