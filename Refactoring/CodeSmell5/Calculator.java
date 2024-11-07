package com.mycompany.codesmell5;

public class Calculator {

    /**
     * Interest rate is defined as a constant to avoid magic numbers.
     */
    private static final double INTEREST_RATE = 0.05;

    public double calculateInterest(double principal) {
        return principal * INTEREST_RATE;
    }
}