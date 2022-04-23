/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res = 1, zeroCount = 0;
        for(int x : nums) {
            if(x == 0) zeroCount++;
            else res = res*x;
        }

        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) nums[i] = zeroCount > 1 ? 0 : res;
            else nums[i] = nums[i] = zeroCount > 0 ? 0 : res/nums[i];
        }
        return nums;
    }
}
// @lc code=end

