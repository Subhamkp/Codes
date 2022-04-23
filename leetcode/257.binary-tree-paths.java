/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    List<TreeNode> al;
    List<String> ans;

    int n;
    StringBuilder res;
    
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        if(root == null) return ans;

        al = new ArrayList<>();
        res = new StringBuilder();
        al.add(root);

        solve(root);

        return ans;
    }

    void solve(TreeNode root) {
        if(root == null) return;

        if(root.left == null && root.right == null) {
            n = al.size(); 
            if(n >= 1) {
                res.append(al.get(0).val);
                for(int i=1;i<n;i++){
                    res.append("->").append(al.get(i).val);
                }
                ans.add(res.toString());
            }
            res.setLength(0);
            return;
        }
        
        al.add(root.left);
        solve(root.left);
        al.remove(al.size() - 1);

        al.add(root.right);
        solve(root.right);
        al.remove(al.size() - 1);

    }
}
// @lc code=end

