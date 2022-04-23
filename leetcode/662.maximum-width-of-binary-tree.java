/*
 * @lc app=leetcode id=662 lang=java
 *
 * [662] Maximum Width of Binary Tree
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
    ArrayList<Integer> startlevelNodes;
    int ans=0;
    public int widthOfBinaryTree(TreeNode root) {
        startlevelNodes = new ArrayList<>();
        solve(root,0,1);
        return ans;
    }

    //Assuming 1 based indexing
    void solve(TreeNode root, int level, int idx) {
        if(root == null) return;
        if(startlevelNodes.size() == level) startlevelNodes.add(idx);
        ans = Math.max(ans,idx-startlevelNodes.get(level)+1);
        solve(root.left,level+1,idx*2); //left child (2*idx)
        solve(root.right,level+1,idx*2+1); //right child (2*idx+1)
    }
}
// @lc code=end

