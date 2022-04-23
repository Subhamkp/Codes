/*
 * @lc app=leetcode id=95 lang=java
 *
 * [95] Unique Binary Search Trees II
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
    public List<TreeNode> generateTrees(int n) {
        return solve(1,n);
    }

    List<TreeNode> solve(int start, int end) {
        ArrayList<TreeNode> list = new ArrayList<>();

        if(start > end) {
            list.add(null);
            return list;
        }

        if(start == end) {
            list.add(new TreeNode(start));
            return list;
        }

        for(int i=start;i<=end;i++) {
            List<TreeNode> leftPossibleTrees = solve(start,i-1);
            List<TreeNode> rightPossibleTrees = solve(i+1,end);

            for(TreeNode left : leftPossibleTrees) {
                for(TreeNode right : rightPossibleTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
// @lc code=end

