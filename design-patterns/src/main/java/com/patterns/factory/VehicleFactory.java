package com.patterns.factory;

/**
 * VehicleFactory class that acts as a factory to create different vehicle types.
 * <p>
 * This factory is responsible for creating instances of vehicles based on the input type.
 * It abstracts away the instantiation logic and allows clients to request specific vehicle types.
 * </p>
 *
 * <h1>Factory Method:</h1>
 * <ul>
 *     <li>The {@code createVehicle} method returns an instance of the appropriate {@link Vehicle} implementation.</li>
 * </ul>
 *
 * <h2>Pros:</h2>
 * <ul>
 *     <li>Decouples the client from the specific class of the objects it needs to instantiate.</li>
 *     <li>Encapsulates object creation, which can be beneficial if you need to change how objects are created in the future.</li>
 * </ul>
 *
 * <h3>Cons:</h3>
 * <ul>
 *     <li>The factory class can grow large if it has to create many different types of objects.</li>
 * </ul>
 *
 * @author Yaswanth
 * @version 1.0
 */
public class VehicleFactory {

    private VehicleFactory() {
        // Prevent instantiation
    }

    /**
     * Creates a vehicle based on the type provided.
     * <p>
     * This method returns a {@link Vehicle} object based on the input string type.
     * If the type is "Car", a {@link Car} object is created; if the type is "Truck", a {@link Truck} object is created.
     * </p>
     *
     * @param type the type of vehicle to create (e.g., "Car" or "Truck")
     * @return a {@link Vehicle} object of the specified type
     */
    public static Vehicle createVehicle(String type) {
        if ("Car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("Truck".equalsIgnoreCase(type)) {
            return new Truck();
        }
        throw new IllegalArgumentException("Unknown vehicle type: " + type);
    }
}
