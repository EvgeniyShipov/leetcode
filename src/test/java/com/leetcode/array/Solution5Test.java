package com.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {

    @Test
    void singleNumber() {
        Solution5 solution = new Solution5();

        assertEquals(1, solution.singleNumber(new int[]{2,2,1}));
        assertEquals(4, solution.singleNumber(new int[]{4,1,2,1,2}));
        assertEquals(1, solution.singleNumber(new int[]{1}));
    }
}