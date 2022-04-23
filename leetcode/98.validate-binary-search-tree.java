/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
 */

// @lc code=start
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
class Solution {
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        return solve(root);
    }

    boolean solve(TreeNode root) {
        if(root == null) return true;
        
        boolean left = isValidBST(root.left);
        if(!left) return false;

        if(prev != null && root.val <= prev.val) return false;
        prev = root;

        boolean right = isValidBST(root.right);
        if(!right) return false;

        return true;
    }
}
// @lc code=end

