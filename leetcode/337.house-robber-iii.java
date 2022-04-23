/*
 * @lc app=leetcode id=337 lang=java
 *
 * [337] House Robber III
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
    public int rob(TreeNode root) {
        return robSub(root, new HashMap<>());
    }

    private int robSub(TreeNode root, Map<TreeNode, Integer> map) {
        if (root == null) return 0;
        if (map.containsKey(root)) return map.get(root);
        
        int val = 0;
        
        if (root.left != null) {
            val += robSub(root.left.left, map) + robSub(root.left.right, map);
        }
        
        if (root.right != null) {
            val += robSub(root.right.left, map) + robSub(root.right.right, map);
        }
        
        val = Math.max(val + root.val, robSub(root.left, map) + robSub(root.right, map));
        map.put(root, val);
        
        return val;
    }

    //More optimized
    // public int rob(TreeNode root) {
    //     int[] res = robSub(root);
    //     return Math.max(res[0], res[1]);
    // }

    // private int[] robSub(TreeNode root) {
    //     if (root == null) return new int[2];
        
    //     int[] left = robSub(root.left);
    //     int[] right = robSub(root.right);
    //     int[] res = new int[2];

    //     //index 0 does not include the root val
    //     //max of notIncluded, Included for both left and right
    //     res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
    //     //index 1 includes thenroot val
    //     res[1] = root.val + left[0] + right[0];
        
    //     return res;
    // }
}
// @lc code=end

