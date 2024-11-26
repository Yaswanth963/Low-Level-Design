package com.patterns.singleton;

/**
 * SingletonClass implemented using Enum.
 * <p>
 * This is the most efficient and preferred way to implement a Singleton in modern Java.
 * It is thread-safe by default and protects against issues like serialization and reflection.
 * </p>
 *
 * <h3>Pros:</h3>
 * <ul>
 *     <li>Simplest and most robust implementation of Singleton.</li>
 *     <li>Thread-safe without requiring explicit synchronization.</li>
 *     <li>Serialization and reflection-safe by design.</li>
 * </ul>
 *
 * <h3>Cons:</h3>
 * <ul>
 *     <li>Not flexible for scenarios where lazy initialization or additional instantiation logic is required.</li>
 * </ul>
 *
 * @author Yaswanth
 * @version 1.0
 */
public enum EnumSingleton {
    /**
     * The Singleton instance.
     */
    INSTANCE;

    /**
     * A sample method to demonstrate Singleton functionality.
     */
    public void doSomething() {
        System.out.println("EnumSingleton: Singleton instance method called.");
    }
}
