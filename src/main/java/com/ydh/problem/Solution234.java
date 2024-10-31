package com.ydh.problem;

// https://leetcode.com/problems/palindrome-linked-list/

//palindrome
//        Palindrome
//A palindrome is a sequence that reads the same forward and backward.

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution234 {
    //  Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindromeUsingStack(ListNode head) {
        head.val = 1;
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        boolean reslut = true;
        ListNode curr = head;
        Stack<Integer> stack = new Stack<>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while (curr != null) {
            if (curr.val == stack.pop()) {
                curr = curr.next;
            } else {
                reslut = false;
                break;
            }
        }


        return reslut;
    }

    public boolean isPalindromeUsingList(ListNode head) {
        head.val = 1;
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);


        boolean result = true;
        List<Integer> list = new ArrayList<>();
        int totalCnt = 0;
        while (true) {
            list.add(head.val);
            head = head.next;
            totalCnt++;
            if (head == null) break;
        }

        int mid = totalCnt / 2 - 1;
        int gap = totalCnt % 2 == 0 ? 1 : 2;
        for (int i = mid; i >= 0; i--) {
            if (list.get(i) == list.get(i + gap)) gap += 2;
            else {
                result = false;
                break;
            }
        }

        return result;
    }
}