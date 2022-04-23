/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length, fartest = 0, next = 0;
        for(int i=0;i<n-1;i++) {
            fartest = Math.max(fartest,nums[i]+i);
            if(i == next) {
                if(next == fartest) return false;
                next = fartest;
            }
        }
        return true;
    }
}
// @lc code=end

