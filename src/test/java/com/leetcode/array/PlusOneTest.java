package com.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {

    @Test
    void plusOne() {

        PlusOne plusOne = new PlusOne();

        assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{4, 3, 3, 0}, plusOne.plusOne(new int[]{4, 3, 2, 9}));
        assertArrayEquals(new int[]{4, 4, 0, 0}, plusOne.plusOne(new int[]{4, 3, 9, 9}));
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, plusOne.plusOne(new int[]{9, 9, 9, 9}));
        assertArrayEquals(new int[]{1}, plusOne.plusOne(new int[]{0}));
    }
}