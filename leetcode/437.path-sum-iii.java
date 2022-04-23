/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
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
    int diff,ans=0;
    HashMap<Integer,Integer> mp; 

    public int pathSum(TreeNode root, int targetSum) {
        diff = targetSum;
        mp = new HashMap<>();
        mp.put(0,1);
        solve(root,0);
        return ans;
    }

    void solve(TreeNode root, int preSum) {
        if(root == null) return;

        // System.out.println("Root preSum "+root.val+" "+preSum);
        if(mp.containsKey(preSum+root.val-diff)) {
            ans+=mp.get(preSum+root.val-diff);
            // System.out.println("Ans "+ans);
        }
        mp.put(preSum+root.val,mp.getOrDefault(preSum+root.val,0)+1);
        
        solve(root.left,preSum+root.val);
        solve(root.right,preSum+root.val);
        
        if(mp.get(preSum+root.val) == 1) {
            mp.remove(preSum+root.val);
        } else {
            mp.put(preSum+root.val,mp.get(preSum+root.val)-1);
        }
    }
}
// @lc code=end

