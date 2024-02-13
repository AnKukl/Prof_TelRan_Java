package com.proftelran.org.lessontwentyfour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationTest {
    private ArrayOperation aop;

    @BeforeEach
    private void init() {
        aop = new ArrayOperation();
    }


    @Test
    public void testFindMax() {
        assertEquals(7, aop.findMax(new int[]{1, 3, 4, 7}));
        assertEquals(-1, aop.findMax(new int[]{-1, -3, -4, -7}));
    }

    @Test
    public void testFindMin() {
        assertEquals(1, aop.findMin(new int[]{1, 3, 4, 7}));
        assertEquals(-7, aop.findMin(new int[]{-1, -3, -4, -7}));
    }

    @Test
    public void testFindMaxWhenArrayIsNull() {
        assertThrows(IllegalArgumentException.class, () -> aop.findMax(null));
    }

    @Test
    public void testFindMaxWhenArrayLengthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> aop.findMax(new int[0]));
    }

    @Test
    public void testFindMinWhenArrayIsNull() {
        assertThrows(IllegalArgumentException.class, () -> aop.findMin(null));
    }

    @Test
    public void testFindMinWhenArrayLengthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> aop.findMin(new int[0]));
    }

}