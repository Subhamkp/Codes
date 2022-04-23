/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
       return solve(root.left,root.right);
    }

    public boolean solve(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null  || q == null) return false;
        else return p.val == q.val && solve(p.left,q.right) && solve(p.right,q.left);
    }
}

// class Solution{
//     public boolean isSymmetric(TreeNode root) {
//         if(root == null) return true;
//         Queue<TreeNode> q = new LinkedList();
       
//         q.add(root.left);
//         q.add(root.right);
//         while(!q.isEmpty()){
//             TreeNode left = q.poll();
//             TreeNode right = q.poll();
//             if(left == null && right == null)
//                 continue;
//             if(left == null || right == null || left.val != right.val )
//                 return false;
//             q.add(left.left);
//             q.add(right.right);
//             q.add(left.right);
//             q.add(right.left);
            
//         }
//         return true;
            
//     }
// }
// @lc code=end

