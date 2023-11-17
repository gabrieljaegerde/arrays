package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {

    @Test
    public void testFindMaximumValue() {
        int[] testArray = {3, 5, 9, 1, 10};
        assertEquals(10, ArrayOperations.findMaximumValue(testArray));
    }

    @Test
    public void testContainsValue() {
        int[] testArray = {1, 2, 3, 4, 5};
        assertTrue(ArrayOperations.containsValue(testArray, 3));
        assertFalse(ArrayOperations.containsValue(testArray, 6));
    }

    @Test
    public void testCalculateAverage() {
        int[] testArray = {10, 20, 30, 40, 50};
        assertEquals(30.0, ArrayOperations.calculateAverage(testArray));
    }

    @Test
    public void testReverseArray() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = {5, 4, 3, 2, 1};
        assertArrayEquals(reversedArray, ArrayOperations.reverseArray(originalArray));
    }

    @Test
    public void testSortArray() {
        int[] originalArray = {5, 3, 4, 1, 2};
        int[] sortedArray = {1, 2, 3, 4, 5};
        ArrayOperations.sortArray(originalArray);
        assertArrayEquals(sortedArray, originalArray);
    }
}
