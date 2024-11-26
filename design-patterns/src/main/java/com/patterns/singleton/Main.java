package com.patterns.singleton;

/**
 * Main class to test various Singleton implementations.
 * <p>
 * This class demonstrates the usage of EnumSingleton, EarlyInitSingleton,
 * and LazyInitSingleton, ensuring that each implementation works correctly.
 * </p>
 *
 * @author Yaswanth
 * @version 1.0
 */
public class Main {
    /**
     * Main method to test Singleton implementations.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Test EnumSingleton
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("EnumSingleton: " + (enumSingleton1 == enumSingleton2));
        enumSingleton1.doSomething();

        // Test EarlyInitSingleton
        EarlyInitSingleton earlyInitSingleton1 = EarlyInitSingleton.getInstance();
        EarlyInitSingleton earlyInitSingleton2 = EarlyInitSingleton.getInstance();
        System.out.println("EarlyInitSingleton: " + (earlyInitSingleton1 == earlyInitSingleton2));
        earlyInitSingleton1.doSomething();

        // Test LazyInitSingleton
        LazyInitSingleton lazyInitSingleton1 = LazyInitSingleton.getInstance();
        LazyInitSingleton lazyInitSingleton2 = LazyInitSingleton.getInstance();
        System.out.println("LazyInitSingleton: " + (lazyInitSingleton1 == lazyInitSingleton2));
        lazyInitSingleton1.doSomething();
    }
}
