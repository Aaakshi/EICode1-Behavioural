package com.Akshi.sorting;

/**
 * Context class to use sorting strategies.
 */
public class SortingContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        if (strategy != null) {
            strategy.sort(array);
        } else {
            System.out.println("No sorting strategy set.");
        }
    }
}
