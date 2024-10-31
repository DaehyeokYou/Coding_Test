package com.ydh.problem;

// https://leetcode.com/problems/number-of-1-bits/
public class Solution191 {
    public int hammingWeightSolution(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) result++;
        }

        return result;
    }

    public int hammingWeight(int n) {
        int result = 0;

        while (n != 0) {
            result += n % 2;
            n = n / 2;
        }

        return result;
    }
}
