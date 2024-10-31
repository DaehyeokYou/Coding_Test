package com.ydh.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/subsets/
public class Solution78 {
    public List<List<Integer>> subsetsUsingBacktracking(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> subsetsUsingPattern(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        createSubset(nums, 0, res, subset);
        return res;
    }

    private void createSubset(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
        if (index == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        createSubset(nums, index + 1, res, subset);

        subset.remove(subset.size() - 1);
        createSubset(nums, index + 1, res, subset);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        int size = nums.length;

        // 하나 짜리는 미리 넣기
        for (int i = 0; i < size; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            result.add(list);
        }

        for (int i = 1; i < size; i++) { // i는 고정할 개수를 의미 (총 반복도 의미)
            int strictStartIdx = 0; // 고정을 시작할 인덱스
            for (int l = 0; l < size - i; l--) {
                int[] arr = new int[i + 1];
                int idx = 0;
                if (strictStartIdx + i >= size)
                    break;
                for (int j = 0 + strictStartIdx; j < i + strictStartIdx; j++) { // 고정 개수만큼 반복, 시작 인덱스도 올라감.
                    arr[idx++] = nums[j];
                }

                for (int k = strictStartIdx + i; k < size; k++) { // 고정개수
                    arr[idx] = nums[k];
                    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
                    result.add(list);
                }
                strictStartIdx++;
            }
        }
        return result;
    }
}
