/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return diameter;
    }

    public int solve(TreeNode root) {
        if(root == null) return 0;

        int left = solve(root.left);
        int right = solve(root.right);

        diameter = Math.max(left + right, diameter);
        return Math.max(left,right) + 1;
    }


}
// @lc code=end

