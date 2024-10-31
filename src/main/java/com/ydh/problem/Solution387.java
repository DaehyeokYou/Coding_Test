package com.ydh.problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/first-unique-character-in-a-string/description/
public class Solution387 {
    public int firstUniqChar(String s) {
        int result = Integer.MAX_VALUE;

        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.add(c)) {
                map.put(c, i);
            } else {
                map.remove(c);
            }
        }

        if (map.size() == 0) return -1;

        for (int idx : map.values()) {
            if (idx < result) result = idx;
        }

        return result;
    }
}
