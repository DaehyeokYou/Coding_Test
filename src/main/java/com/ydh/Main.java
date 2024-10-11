package com.ydh;

import java.util.Arrays;

import com.ydh.problem.Solution1;
import com.ydh.problem.Solution114;
import com.ydh.problem.Solution1296;
import com.ydh.problem.Solution79;

public class Main {
    public static void main(String[] args) {
        // Solution 1296
//        int[] nums = {1,2,3,3,4,4,5,6};
//        int k=4;
//        boolean result1296 = new Solution1296().isPossibleDivide(nums, k);
//        System.out.println("result = " + result1296);

        // Solution 79
//        char[][] board = {
//                {'C','A','A'},
//                {'A','A','A'},
//                {'B','C','D'}
//        };;
//        String word = "AAB";
//        Boolean result79 = new Solution79().exist(board, word);
//        System.out.println("result = " + result79);

        // Solution 114
        //    Input: root = [1,2,5,3,4,null,6]
        //    Output: [1 2 3 4 5 6 ]
//        Solution114.TreeNode root = new Solution114.TreeNode(1);
//        root.left = new Solution114.TreeNode(2);
//        root.left.left = new Solution114.TreeNode(3);
//        root.left.right = new Solution114.TreeNode(4);
//        root.right = new Solution114.TreeNode(5);
//        root.right.right = new Solution114.TreeNode(6);
//
//        new Solution114().flatten(root);
//        System.out.print("[");
//        while (root != null) {
//            System.out.print(root.val + " ");
//            root = root.right;
//        }
//        System.out.println("]");

        // Solution 1
        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new Solution1().twoSum(nums, target);
        Arrays.stream(result).forEach(System.out::println);
    }
}