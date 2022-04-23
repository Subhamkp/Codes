/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null){
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }



    // List<Integer> res;
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     res = new ArrayList<>();
    //     solve(root);
    //     return res;
    // }
    // void solve(TreeNode root) {
    //     if(root == null) return;
    //     solve(root.left);
    //     res.add(root.val);
    //     solve(root.right);
    // }

}
// @lc code=end

