package com.patterns.singleton;

/**
 * SingletonClass implemented using Early Initialization.
 * <p>
 * This Singleton is initialized as soon as the class is loaded.
 * It does not require synchronization and is simple to implement.
 * However, it may lead to unnecessary memory usage if the Singleton instance is not used.
 * </p>
 *
 * <h3>Pros:</h3>
 * <ul>
 *     <li>Simplest implementation (no synchronization required).</li>
 *     <li>Thread-safe due to the JVM's class-loading mechanism.</li>
 * </ul>
 *
 * <h3>Cons:</h3>
 * <ul>
 *     <li>Not memory efficient if the Singleton is never used in the program.</li>
 * </ul>
 *
 * @author Yaswanth
 * @version 1.0
 */
public class EarlyInitSingleton {

    /**
     * The Singleton instance, created eagerly at class loading time.
     */
    private static final EarlyInitSingleton INSTANCE = new EarlyInitSingleton();

    /**
     * Private constructor to prevent external instantiation.
     */
    private EarlyInitSingleton() {
    }

    /**
     * Returns the Singleton instance.
     *
     * @return the Singleton instance
     */
    public static EarlyInitSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * A sample method to demonstrate Singleton functionality.
     */
    public void doSomething() {
        System.out.println("EarlyInitSingleton: Singleton instance method called.");
    }
}
