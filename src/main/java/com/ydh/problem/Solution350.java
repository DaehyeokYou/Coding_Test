package com.ydh.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums1.length; i++) {
            mp.put(nums1[i], mp.getOrDefault(nums1[i],0) + 1);
        }

        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<nums2.length; i++) {
            if(mp.containsKey(nums2[i]) && mp.get(nums2[i]) > 0) {
                lst.add(nums2[i]);
                mp.put(nums2[i], mp.get(nums2[i])-1 );
            }
        }

        int[] rst = lst.stream().mapToInt(e -> e.intValue()).toArray();

        int[] result = new int[lst.size()];
        for(int i=0; i<lst.size(); i++) {
            result[i] = lst.get(i);
        }
        return result;
    }

    public int[] myintersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int offset=0;
        boolean fin = false;
        List<Integer> resList = new ArrayList<>();
        for(int i=0; i<nums1.length; i++) {
            if(fin) break;
            for(int j=0+offset; j<nums2.length; j++) {
                if(nums1[i] < nums2[j]) break;

                if(nums1[i] == nums2[j]){
                    resList.add(nums1[i]);
                    offset=j+1;
                    if(offset == nums2.length) fin = true;
                    break;
                }
            }
        }

        int[] res= resList.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}
