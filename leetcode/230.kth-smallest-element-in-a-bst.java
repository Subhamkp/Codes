/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
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
    int K,ans = -1;
    public int kthSmallest(TreeNode root, int k) {
        K = k;
        solve(root);
        return ans;
    }

    void solve(TreeNode root) {
        if(root == null) return;

        if(K > 0) solve(root.left);

        if(--K == 0) {
            ans = root.val;
            return;
        }

        if(K > 0) solve(root.right);
    }
}
// @lc code=end

