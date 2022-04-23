/*
 * @lc app=leetcode id=865 lang=java
 *
 * [865] Smallest Subtree with all the Deepest Nodes
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
    HashMap<TreeNode,Integer> mp;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        mp = new HashMap<>();

        if(root == null) return root;

        int left = 0, right = 0;
        
        height(root);

        while(root != null) {
            left = mp.getOrDefault(root.left,-1);
            right = mp.getOrDefault(root.right,-1);
            if(left > right) root = root.left;
            else if(right > left) root = root.right;
            else return root;
        }
        return null;
    }

    public int height(TreeNode root) {
        if(root == null) return 0;
        int ans = Math.max(height(root.left),height(root.right)) + 1;
        mp.put(root,ans);
        return ans;
    }
}
// @lc code=end

