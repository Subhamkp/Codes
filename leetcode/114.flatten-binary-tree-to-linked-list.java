/*
 * @lc app=leetcode id=114 lang=java
 *
 * [114] Flatten Binary Tree to Linked List
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
    TreeNode last = null;
    public void flatten(TreeNode root) {
        solve(root);
    }

    void solve(TreeNode root) {
        if(root == null) return;
        solve(root.right);
        solve(root.left);
        root.left = null;
        root.right = last;
        last = root;
    }
}
// @lc code=end

