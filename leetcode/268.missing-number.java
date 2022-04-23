/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int i = 0, res = 0;
        for(int x : nums) {
            res = res^i;
            res = res^x;
            i++;
        }
        res = res^i;
        return res;
    }
}
// @lc code=end

