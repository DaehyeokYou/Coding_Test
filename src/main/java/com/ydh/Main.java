package com.ydh;

import com.ydh.problem.Solution1296;

public class Main {
    public static void main(String[] args) {
        // Solution 1296
        int[] nums = {1,2,3,3,4,4,5,6};
        int k=4;
        Solution1296 sol = new Solution1296();
        boolean result = sol.isPossibleDivide(nums, k);
        System.out.println("result = " + result);

    }
}