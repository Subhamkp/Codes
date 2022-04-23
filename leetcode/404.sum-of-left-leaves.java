/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        solve(root);
        return sum;
    }

    void solve(TreeNode root) {
        if(root == null) return;

        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) {
                sum+=root.left.val;
            }
        }
        solve(root.left);
        solve(root.right);
    }
}
// @lc code=end

