/*
 * @lc app=leetcode id=1302 lang=java
 *
 * [1302] Deepest Leaves Sum
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
    int maxLevel = -1, sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        solve(root,0);
        return sum;
    }

    public void solve(TreeNode root, int level) {
        if(root == null) return;
        if(level == maxLevel) {
            sum+=root.val;
        }
        else if(level > maxLevel) {
            sum = root.val;
            maxLevel = level;
        }
        solve(root.left,level+1);
        solve(root.right,level+1);
    }

}
// @lc code=end

