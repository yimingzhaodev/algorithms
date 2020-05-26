package com.company;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
         if (root == null)
             return true;
         return preorder(root.left, root.right);
    }

    public boolean preorder(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        else if (left.val != right.val) {
            return false;
        }
        else {
            return preorder(left.left, right.right) && preorder(left.right, right.left);
        }
    }
}
