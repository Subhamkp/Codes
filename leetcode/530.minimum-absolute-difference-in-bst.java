/*
 * @lc app=leetcode id=530 lang=java
 *
 * [530] Minimum Absolute Difference in BST
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
    int ans = 100005, prev = -1;
    public int getMinimumDifference(TreeNode root) {
        solve(root);
        return ans;
    }

    void solve(TreeNode root) {
        if(root == null) return;
        
        solve(root.left);
        if(prev != -1) ans = Math.min(root.val-prev,ans);
        prev = root.val;
        solve(root.right);

    }
}
// @lc code=end

