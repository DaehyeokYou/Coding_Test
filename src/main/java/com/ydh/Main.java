package com.ydh;

import com.ydh.problem.Solution1296;
import com.ydh.problem.Solution79;

public class Main {
    public static void main(String[] args) {
        // Solution 1296
//        int[] nums = {1,2,3,3,4,4,5,6};
//        int k=4;
//        boolean result1296 = new Solution1296().isPossibleDivide(nums, k);
//        System.out.println("result = " + result1296);

        char[][] board = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}
        };;
        String word = "AAB";
        Boolean result79 = new Solution79().exist(board, word);
        System.out.println("result = " + result79);
    }
}