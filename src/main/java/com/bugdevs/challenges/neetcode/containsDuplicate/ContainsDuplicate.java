package com.bugdevs.challenges.neetcode.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    ContainsDuplicate() {
    }

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) if (!seen.add(num)) return true;

        return false;
    }
}
