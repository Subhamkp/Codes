/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(root == null) return res;

        Deque<TreeNode> q = new LinkedList<>();
        TreeNode temp;
        int height = 0, n = 0;

        q.add(root);
        while(!q.isEmpty()) {
            
            if(height == res.size()) res.add(new ArrayList<>());
            
            n = q.size();
            while(--n >= 0) {
                temp = q.poll();
                res.get(height).add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            
            height++;
        }

        return res;
    }


    // public List<List<Integer>> levelOrder(TreeNode root) {
    //     List<List<Integer>> res = new ArrayList<List<Integer>>();
    //     levelHelper(res, root, 0);
    //     return res;
    // }
    
    // public void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
    //     if (root == null) return;
    //     if (height == res.size()) {
    //         res.add(new LinkedList<Integer>());
    //     }
    //     res.get(height).add(root.val);
    //     levelHelper(res, root.left, height+1);
    //     levelHelper(res, root.right, height+1);
    // }
}
// @lc code=end

