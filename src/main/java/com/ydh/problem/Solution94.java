package com.ydh.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/binary-tree-inorder-traversal/description/?envType=problem-list-v2&envId=depth-first-search&
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        addTreeToListInorder(root, result);
        return result;
    }

    public void addTreeToListInorder(TreeNode root, List<Integer> result) {
        if (root == null) return;

        addTreeToListInorder(root.left, result);
        result.add(root.val);
        addTreeToListInorder(root.right, result);
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
