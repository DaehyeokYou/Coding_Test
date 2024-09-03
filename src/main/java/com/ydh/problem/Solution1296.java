package com.ydh.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
public class Solution1296 {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) {
            return false;
        }

        Map<Integer, Integer> cnt = new HashMap<>();
        for (int v : nums) {
            cnt.put(v, cnt.getOrDefault(v, 0) + 1);
        }
        Arrays.sort(nums);
        for (int v : nums) {
            if (cnt.containsKey(v)) {
                for (int x = v; x < v + k; ++x) {
                    if (!cnt.containsKey(x)) {
                        return false;
                    }
                    cnt.put(x, cnt.get(x) - 1);
                    if (cnt.get(x) == 0) {
                        cnt.remove(x);
                    }
                }
            }
        }
        return true;
    }

    public boolean isPossibleDivide2(int[] nums, int k) {
        if (nums.length % k != 0) {
            return false;
        }
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int h : nums) {
            tm.put(h, tm.getOrDefault(h, 0) + 1);
        }
        while (!tm.isEmpty()) {
            int v = tm.firstKey();
            for (int i = v; i < v + k; ++i) {
                if (!tm.containsKey(i)) {
                    return false;
                }
                if (tm.get(i) == 1) {
                    tm.remove(i);
                } else {
                    tm.put(i, tm.get(i) - 1);
                }
            }
        }
        return true;
    }
}
