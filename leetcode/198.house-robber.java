/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        //Lets start : 2022-03-06 11:04:09
        int n = nums.length,ans;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);
        ans = nums[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++) {
            nums[i] = Math.max(nums[i-2]+nums[i],nums[i-1]);
            ans = Math.max(nums[i],ans);
        }
        return ans;
        //Times Up : 2022-03-06 11:10:05
    }
}
// @lc code=end

