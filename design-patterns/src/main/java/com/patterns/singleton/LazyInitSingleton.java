package com.patterns.singleton;

/**
 * SingletonClass implemented using Lazy Initialization with Double-Checked Locking.
 * <p>
 * This Singleton is initialized only when it is first accessed, making it memory-efficient.
 * Double-checked locking ensures thread-safety with minimal synchronization overhead.
 * </p>
 *
 * <h3>Pros:</h3>
 * <ul>
 *     <li>Lazy initialization saves memory if the Singleton is never used.</li>
 *     <li>Thread-safe with reduced synchronization overhead.</li>
 * </ul>
 *
 * <h3>Cons:</h3>
 * <ul>
 *     <li>Slightly more complex to implement compared to early initialization.</li>
 * </ul>
 *
 * @author Yaswanth
 * @version 1.0
 */
public class LazyInitSingleton {

    /**
     * The Singleton instance, declared volatile to ensure visibility in multithreaded environments.
     */
    private static volatile LazyInitSingleton instance = null;

    /**
     * Private constructor to prevent external instantiation.
     */
    private LazyInitSingleton() {
    }

    /**
     * Returns the Singleton instance, using double-checked locking for thread safety.
     *
     * @return the Singleton instance
     */
    public static LazyInitSingleton getInstance() {
        if (instance == null) { // First check (without synchronization)
            synchronized (LazyInitSingleton.class) {
                if (instance == null) { // Second check (with synchronization)
                    instance = new LazyInitSingleton();
                }
            }
        }
        return instance;
    }

    /**
     * A sample method to demonstrate Singleton functionality.
     */
    public void doSomething() {
        System.out.println("LazyInitSingleton: Singleton instance method called.");
    }
}
