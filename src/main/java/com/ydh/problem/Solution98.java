package com.ydh.problem;

// https://leetcode.com/problems/validate-binary-search-tree/description/?envType=problem-list-v2&envId=depth-first-search&
public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode node, long minimum, long maximum) {
        if (node == null) return true;

        if (!(node.val > minimum && node.val < maximum)) return false;

        return valid(node.left, minimum, node.val) && valid(node.right, node.val, maximum);
    }

    // Definition for a binary tree node.
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
