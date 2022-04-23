/*
 * @lc app=leetcode id=863 lang=java
 *
 * [863] All Nodes Distance K in Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,Integer> mp;
    List<Integer> ans;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        mp = new HashMap<>();
        ans = new ArrayList<>();

        pre(root,target);
        solve(root,0,k);
        return ans;
    }

    void solve(TreeNode root,int len, int k) {
        if(root == null) return;

        if(mp.containsKey(root)) {
            len = mp.get(root);
        }

        if(len == k) {
            ans.add(root.val);
        }

        solve(root.left,len+1,k);
        solve(root.right,len+1,k);
    }

    int pre(TreeNode root, TreeNode target) {

        if(root == null) return -1;

        if(root == target) {
            mp.put(root,0);
            return 0;
        }

        int left = pre(root.left,target);
        if(left >= 0) {
            mp.put(root,left+1);
            return left + 1;
        }
        int right = pre(root.right,target);
        if(right >= 0) {
            mp.put(root,right+1);
            return right + 1;
        }

        return -1;
    }
}
// @lc code=end

