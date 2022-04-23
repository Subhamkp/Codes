/*
 * @lc app=leetcode id=99 lang=java
 *
 * [99] Recover Binary Search Tree
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
    TreeNode prev, first = null, second = null;
    public void recoverTree(TreeNode root) {
        solve(root);
        if(second != null) {
            int tmp = first.val;
            first.val = second.val;
            second.val = tmp;
        }
    }

    void solve(TreeNode root) {
        if(root == null) return;
        solve(root.left);

        if(prev != null && root.val <= prev.val) {
            if(first == null) {
                first = prev;
                second = root;
                // System.out.println("first :"+first.val);
            }
            else {
                int tmp = first.val;
                first.val = root.val;
                root.val = tmp;
                second = null;
                // System.out.println("first root :"+first.val+" "+root.val);
            }
        }
        prev = root;
        solve(root.right);
    }
}
// @lc code=end

