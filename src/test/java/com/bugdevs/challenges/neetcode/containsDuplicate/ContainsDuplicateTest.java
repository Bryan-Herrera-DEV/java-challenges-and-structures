package com.bugdevs.challenges.neetcode.containsDuplicate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void testDuplicateMiddle() {
        assertTrue(containsDuplicate.hasDuplicate(new int[]{1, 2, 3, 3}));
    }

    @Test
    public void testNoDuplicates() {
        assertFalse(containsDuplicate.hasDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testEmptyArray() {
        assertFalse(containsDuplicate.hasDuplicate(new int[]{}));
    }

    @Test
    public void testSingleElement() {
        assertFalse(containsDuplicate.hasDuplicate(new int[]{99}));
    }

    @Test
    public void testTwoSameElements() {
        assertTrue(containsDuplicate.hasDuplicate(new int[]{5, 5}));
    }

    @Test
    public void testNegativeNumbersWithDuplicates() {
        assertTrue(containsDuplicate.hasDuplicate(new int[]{-1, -2, -3, -1}));
    }

    @Test
    public void testLargeNumbers() {
        assertTrue(containsDuplicate.hasDuplicate(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0, Integer.MAX_VALUE}));
    }

    @Test
    public void testAllUniqueNegatives() {
        assertFalse(containsDuplicate.hasDuplicate(new int[]{-1, -2, -3, -4, -5}));
    }

    @Test
    public void testDuplicateAtEnd() {
        assertTrue(containsDuplicate.hasDuplicate(new int[]{10, 20, 30, 40, 10}));
    }

    @Test
    public void testLargeUniqueArray() {
        int[] nums = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        assertFalse(containsDuplicate.hasDuplicate(nums));
    }
}
