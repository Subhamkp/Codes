/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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

    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null){
            while(cur != null){
                list.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
        return list;
    }



    // List<Integer> al;
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     al = new ArrayList<>();
    //     solve(root);
    //     return al;
    // }

    // void solve(TreeNode root) {
    //     if(root == null) return;
    //     al.add(root.val);
    //     solve(root.left);
    //     solve(root.right);
    // }
}
// @lc code=end

