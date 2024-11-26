package com.patterns.factory;

/**
 * Truck class that implements the Vehicle interface.
 * This class represents a truck that can be driven.
 *
 * @author Yaswanth
 * @version 1.0
 */
public class Truck implements Vehicle {
    /**
     * Implementation of the drive method for the Truck.
     * This method prints a message indicating that the truck is being driven.
     */
    @Override
    public void drive() {
        System.out.println("Driving a truck.");
    }
}
