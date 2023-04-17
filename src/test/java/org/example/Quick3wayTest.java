package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quick3wayTest {
    @Test
    public void testSortEmptyArray() {
        String[] arr = new String[0];
        Quick3way.sort(arr);
        assertTrue(Quick3way.isSorted(arr));
    }
    @Test
    public void testSortArraySizeOne() {
        String[] arr = new String[]{"a"};
        Quick3way.sort(arr);
        assertTrue(Quick3way.isSorted(arr));
    }
    @Test
    public void testSortArraySizeTwo() {
        String[] arr = new String[]{"b", "a"};
        Quick3way.sort(arr);
        assertTrue(Quick3way.isSorted(arr));
    }
    @Test
    public void testSortAlreadySortedArray() {
        String[] arr = new String[]{"a", "b", "c", "d", "e"};
        Quick3way.sort(arr);
        assertTrue(Quick3way.isSorted(arr));
    }
    @Test
    public void testSortReverseSortedArray() {
        String[] arr = new String[]{"e", "d", "c", "b", "a"};
        Quick3way.sort(arr);
        assertTrue(Quick3way.isSorted(arr));
    }
    @Test
    public void testSortArrayWithDuplicateValues() {
        String[] arr = new String[]{"b", "a", "c", "b", "d", "e", "c", "f", "a"};
        Quick3way.sort(arr);
        assertTrue(Quick3way.isSorted(arr));
    }

    @Test
    public void testSortLargeRandomArray() {
        int size = 100000;
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = String.valueOf(edu.princeton.cs.algs4.StdRandom.uniform(size));
        }
        Quick3way.sort(arr);
        assertTrue(Quick3way.isSorted(arr));
    }

}