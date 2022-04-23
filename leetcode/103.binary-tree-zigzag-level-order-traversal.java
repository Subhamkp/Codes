/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Zigzag Level Order Traversal
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);

        int n;
        boolean flag = true;
        TreeNode temp;
        LinkedList<Integer> tempAr;

        while(!q.isEmpty()) {
            n = q.size();
            tempAr = new LinkedList<>();

            while(--n>=0) {
                temp = q.poll();
                if(flag) {
                    tempAr.add(temp.val);
                } else {
                    tempAr.addFirst(temp.val);
                }
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            flag = !flag;
            res.add(tempAr);
        }
        return res;
    }

    //Using 2 stacks
    // public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    //     List<List<Integer>> res = new ArrayList<>();
    //     if(root == null) return res;
        
    //     Stack<TreeNode> st1 = new Stack<>();
    //     Stack<TreeNode> st2 = new Stack<>();
    //     st1.push(root);

    //     int n;
    //     boolean flag = true;
    //     TreeNode temp;
    //     ArrayList<Integer> tempAr;

    //     while(!st1.isEmpty() || !st2.isEmpty()) {

    //         if(flag) n = st1.size();
    //         else n = st2.size();

    //         tempAr = new ArrayList<>();

    //         while(--n>=0) {
    //             if(flag) {
    //                 temp = st1.pop();
    //                 tempAr.add(temp.val);
    //                 if(temp.left != null) st2.push(temp.left);
    //                 if(temp.right != null) st2.push(temp.right);
    //             } else {
    //                 temp = st2.pop();
    //                 tempAr.add(temp.val);
    //                 if(temp.right != null) st1.push(temp.right);
    //                 if(temp.left != null) st1.push(temp.left);
    //             }
    //         }
    //         flag = !flag;
    //         res.add(tempAr);
    //     }
    //     return res;
    // }
}
// @lc code=end

