/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
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

    //Reverse operation of preorder
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> list = new LinkedList<>();
        
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null){
            while(cur != null){
                list.addFirst(cur.val);
                stack.push(cur);
                cur = cur.right; //curr.left (preorder) -> curr.right (postorder)
            }
            cur = stack.pop();
            cur = cur.left; //curr.right (preorder) -> curr.left (postorder)
        }
        return list;
    }

    // List<Integer> list;
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     list = new ArrayList<>();
    //     solve(root);
    //     return list;
    // }

    // void solve(TreeNode root) {
    //     if(root == null) return;
    //     solve(root.left);
    //     solve(root.right);
    //     list.add(root.val);
    // }
}
// @lc code=end

