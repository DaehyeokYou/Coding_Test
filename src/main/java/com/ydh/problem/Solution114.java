package com.ydh.problem;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
public class Solution114 {

    List<Integer> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        helper(root);
        if (list.size() == 0) {
            return;
        }
        for (int i = 0;i<list.size()-1;i++) {
            root.val = list.get(i);
            root.right = new TreeNode();
            root.left = null;
            root = root.right;
        }
        root.val = list.get(list.size()-1);
    }
    public void helper (TreeNode root) {
        if (root == null) {return;}
        list.add(root.val);
        helper(root.left);
        helper(root.right);
    }

    //Definition for a binary tree node.
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
