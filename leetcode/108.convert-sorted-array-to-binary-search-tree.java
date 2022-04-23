/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return solve(0,nums.length - 1,nums);
    }

    TreeNode solve(int l, int r, int[] nums) {
        if(l > r) return null;

        int mid = l + (r - l)/2;
        TreeNode temp = new TreeNode(nums[mid]);
        temp.left = solve(l,mid-1,nums);
        temp.right = solve(mid+1,r,nums);

        return temp;
    }
}
// @lc code=end

