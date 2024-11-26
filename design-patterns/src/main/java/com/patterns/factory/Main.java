package com.patterns.factory;

/**
 * Main class to test the Factory Design Pattern.
 * <p>
 * This class demonstrates how the factory creates different types of vehicles based on input.
 * </p>
 *
 * @author Yaswanth
 * @version 1.0
 */
public class Main {
    /**
     * The main method that tests the Factory pattern by creating different vehicle types.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Create a Car using the VehicleFactory
        Vehicle car = VehicleFactory.createVehicle("Car");
        car.drive();

        // Create a Truck using the VehicleFactory
        Vehicle truck = VehicleFactory.createVehicle("Truck");
        truck.drive();
    }
}
