/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length - 1;
        int l = 0, r = n, ans = 0, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if ((mid == 0 || nums[mid - 1] <= nums[mid]) &&
                    (mid == n || nums[mid + 1] <= nums[mid])) {
                ans = mid;
                break;
            } else if (mid > 0 && nums[mid - 1] > nums[mid])
                r = mid - 1; //downward slope
            else
                l = mid + 1; //upward slope
        }
        return ans;
    }
}
// @lc code=end

