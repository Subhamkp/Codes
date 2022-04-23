/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0, res = Integer.MIN_VALUE;
        for(int x : nums) {
            curr = Math.max(curr + x, x);
            res = Math.max(res,curr);
        }
        return res;
    }
}
// @lc code=end

