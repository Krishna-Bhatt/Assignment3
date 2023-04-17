package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Quick.*;
import static org.junit.jupiter.api.Assertions.*;
class QuickTest {
    @Test
    void testAlreadySortedArray() {
            String[] a =new String[]{"A","B","C","D","E"};
            Quick.sort(a);
            assertTrue(isSorted(a));
        }

    @Test
    void testJEqualsLo() {
        Comparable[] a = new Comparable[] {'C','B','A'};
        Quick.sort(a);
        assertArrayEquals(new Comparable[] {'A','B','C'}, a);
    }

    @Test
    void testSelectInvalidK() {
        assertThrows(IllegalArgumentException.class, () -> {
            Comparable[] a = {'B','D','A','F'};
            Quick.select(a, -1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Comparable[] a = {'B','D','A','F'};
            Quick.select(a, 5);
        });
    }
    @Test
    void testSelectKEqualsToZero() {
        Comparable[] a = { 'B','D','A','F'};
        assertEquals('A', Quick.select(a, 0));
    }

    @Test
    void testIGreaterThanK() {
        Character[] a = {'P', 'G', 'B', 'E', 'A', 'I', 'M'};
        assertEquals('P', Quick.select(a, 6));
    }
    @Test
    void testWhileLessChar() {
        Character[] a = new Character[] {'B', 'C', 'A'};
        int lo = 0;
        int hi = a.length - 1;
        int j = partition(a, lo, hi);
        assertEquals(lo, j-1);
        assertArrayEquals(new Character[] {'A', 'B', 'C'}, a);
    }
    @Test
    void testShow(){
        Character[] a = new Character[] {'B', 'C', 'A'};
        Quick.show(a);

    }
    @Test
    void testSort() {
        Comparable[] a = { 3, 2, 1 };
        assertFalse(isSorted(a));
    }

    @Test
    void testPartitionWithEqualIndices() {
        Character[] a = {'E', 'A', 'S', 'Y', 'Q', 'U', 'E', 'S', 'T', 'I', 'O', 'N'};
        Quick.sort(a, 1, a.length - 1);
        assertTrue(isSorted(a, 1, a.length - 1));
    }
    @Test
    void testWithInvalidIndex(){
        String[] arr5 = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        int k = 11; // Invalid index
        try {
            Comparable result = Quick.select(arr5, k);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Assert that the correct error message is thrown
            assertEquals("index is not between 0 and 11: 11", e.getMessage());
        }
    }


}