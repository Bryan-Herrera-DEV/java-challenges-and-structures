package com.bugdevs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuclideanTest {
    @Test
    public void testGCD() {
        assertEquals(1, Euclidean.euclideanAlgorithm(1, 1));
    }
}


