package com.patterns.factory;


/**
 * Vehicle interface that defines a contract for all vehicle types.
 * <p>
 * Any class that implements this interface must provide its own implementation of the {@code drive} method.
 * </p>
 *
 * @author Yaswanth
 * @version 1.0
 */
public interface Vehicle {
    /**
     * The method to drive the vehicle.
     * Each vehicle type will have its own implementation of this method.
     */
    void drive();
}
