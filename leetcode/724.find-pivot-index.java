/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++) {
            nums[i]+=nums[i-1];
        }

        int left = 0, right = 0;
        for(int i=0;i<n;i++) {
            if(i == 0) left = 0;
            else left = nums[i-1];
            if(i == n-1) right = 0;
            else right = nums[n-1] - nums[i];

            if(left == right) return i;

        }
        return -1;
    }
}
// @lc code=end

