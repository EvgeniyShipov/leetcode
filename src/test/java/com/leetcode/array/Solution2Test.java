package com.leetcode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private Solution2 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution2();
    }

    @Test
    void maxProfit() {
        int result1 = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(7, result1);

        int result2 = solution.maxProfit(new int[]{1, 2, 3, 4, 5});
        assertEquals(4, result2);

        int result3 = solution.maxProfit(new int[]{7, 6, 4, 3, 1});
        assertEquals(0, result3);
    }
}