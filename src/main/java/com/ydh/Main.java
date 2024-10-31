package com.ydh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        int[] result = new Solution1().twoSum(nums, target);
//        Arrays.stream(result).forEach(System.out::println);

        // 정적 배열
        /*
        메서드가 없음.. add, remove가 껄끄러움... 사이즈가 미리 정해져야 함.
         */
        int[] staticArr = new int[5];
        int[] staticArr2 = {1,2,3,4,5};
        for(int v: staticArr) System.out.print(v + " ");    // 0 0 0 0 0
        for(int v: staticArr2) System.out.print(v + " ");    // 1 2 3 4 5
        // 리스트
        /*
        메서드가 있음!! add, remove가 쉬움!!!
         */
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        Integer[] staticArrBoxed = {3,4,1,7,9,2,0};
//        Arrays.sort(staticArr2, Collections.reverseOrder());  // 에러
        Arrays.sort(staticArrBoxed, Collections.reverseOrder());
        for(int v: staticArrBoxed) System.out.print(v + " ");   // 9 7 4 3 2 1 0
        Arrays.sort(staticArrBoxed);
        for(int v: staticArrBoxed) System.out.print(v + " ");   // 0 1 2 3 4 7 9

//        Arrays.sort(list);  // 에러
        Collections.sort(list); // OK

        Pair[] a = {
                new Pair(1,8),
                new Pair(1,6),
                new Pair(1,9),
                new Pair(5,7),
                new Pair(3,4),
                new Pair(1,4),
                new Pair(6,4),
                new Pair(9,0)
        };
        List<Pair> b = new ArrayList<>(Arrays.asList(new Pair(1,8), new Pair(5,7)));
        b.add(new Pair(3, 5));
        b.add(new Pair(1, 2));
        b.add(new Pair(3, 3));
        b.add(new Pair(2, 4));
        System.out.println();
        // 1순위는 y는 오름차순, 2순위는 x는 내림차순
        Arrays.sort(a, (p1,p2) -> (p1.y == p2.y) ? Integer.compare(p2.x, p1.x) : Integer.compare(p1.y, p2.y));
        for(Pair p: a) System.out.println(p.x + ", " + p.y);

        // 1순위 x는 오름차순, 2순위 y는 내림차순
        Collections.sort(b, (p1, p2) -> (p1.x == p2.x) ? Integer.compare(p2.y, p1.y) : Integer.compare(p1.x, p2.x));
        for(Pair p: b) System.out.println(p.x + ", " + p.y);

    }
    public static class Pair {
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}