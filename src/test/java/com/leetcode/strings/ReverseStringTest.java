package com.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    @Test
    void reverseString() {
        ReverseString reverseString = new ReverseString();

        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, reverseString.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}));
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, reverseString.reverseString(new char[]{'H', 'a', 'n', 'n', 'a', 'h'}));
    }
}