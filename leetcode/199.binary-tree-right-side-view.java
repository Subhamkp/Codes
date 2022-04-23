/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
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
    ArrayList<Integer> ar;
    public List<Integer> rightSideView(TreeNode root) {
        ar = new ArrayList<>();
        solve(root,0);
        return ar;
    }

    void solve(TreeNode root, int level) {
        if(root == null) return;

        if(ar.size() == level) {
            ar.add(root.val);
        }
        solve(root.right, level + 1);
        solve(root.left,level + 1);
    }


    //Iterative
    // public List<Integer> rightSideView(TreeNode root) {
    //     if (root == null) return new ArrayList();
    //     Queue<TreeNode> queue = new LinkedList();
    //     queue.add(root);

    //     List<Integer> res = new ArrayList();
    //     while(!queue.isEmpty()){
    //         int size = queue.size();
            
    //         while (size-- > 0){
    //             TreeNode cur = queue.poll();
    //             if (size == 0)
    //                 res.add(cur.val);
                
    //             if (cur.left != null)
    //                 queue.add(cur.left);
    //             if (cur.right != null)
    //                 queue.add(cur.right);
    //         }
    //     }
    //     return res;
    // }
}
// @lc code=end

