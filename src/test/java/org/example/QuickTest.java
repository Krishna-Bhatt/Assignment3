package org.example;

import static org.example.Quick.*;
import static org.junit.jupiter.api.Assertions.*;
class QuickTest {
    @org.junit.jupiter.api.Test
    void test_already_sorted_array() {
            String[] a =new String[]{"A","B","C","D","E"};
            Quick.sort(a);
            assertTrue(isSorted(a));
        }

    @org.junit.jupiter.api.Test
    void testJEqualsLo() {
        Comparable[] a = new Comparable[] {'C','B','A'};
        Quick.sort(a);
        assertArrayEquals(new Comparable[] {'A','B','C'}, a);
    }

    @org.junit.jupiter.api.Test
    void test_select_invalid_k() {
        assertThrows(IllegalArgumentException.class, () -> {
            Comparable[] a = {'B','D','A','F'};
            Quick.select(a, -1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Comparable[] a = {'B','D','A','F'};
            Quick.select(a, 5);
        });
    }
    @org.junit.jupiter.api.Test
    void test_select_k_equals_0() {
        Comparable[] a = { 'B','D','A','F'};
        assertEquals('A', Quick.select(a, 0));
    }

    @org.junit.jupiter.api.Test
    void testIGreaterThanK() {
        Character[] a = {'P', 'G', 'B', 'E', 'A', 'I', 'M'};
        assertEquals('P', Quick.select(a, 6));
    }
    @org.junit.jupiter.api.Test
    void testWhileLessChar() {
        Character[] a = new Character[] {'B', 'C', 'A'};
        int lo = 0;
        int hi = a.length - 1;
        int j = partition(a, lo, hi);
        assertEquals(lo, j-1);
        assertArrayEquals(new Character[] {'A', 'B', 'C'}, a);
    }
    @org.junit.jupiter.api.Test
    void testShow(){
        Character[] a = new Character[] {'B', 'C', 'A'};
        Quick.show(a);

    }
    @org.junit.jupiter.api.Test
    void testSort() {
        Comparable[] a = { 3, 2, 1 };
        assertFalse(isSorted(a));
    }

    @org.junit.jupiter.api.Test
    void testPartitionWithEqualIndices() {
        Character[] a = {'E', 'A', 'S', 'Y', 'Q', 'U', 'E', 'S', 'T', 'I', 'O', 'N'};
        Quick.sort(a, 1, a.length - 1);
        assertTrue(isSorted(a, 1, a.length - 1));
    }
}