package com.patterns.factory;


/**
 * Car class that implements the Vehicle interface.
 * This class represents a car that can be driven.
 *
 * @author Yaswanth
 * @version 1.0
 */
public class Car implements Vehicle {
    /**
     * Implementation of the drive method for the Car.
     * This method prints a message indicating that the car is being driven.
     */
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}
