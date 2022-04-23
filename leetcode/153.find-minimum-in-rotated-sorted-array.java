/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int l = 0, r = n - 1, mid;
        int pivot = nums[n-1], ans = -1;
        while(l <= r) {
            mid = l + (r-l)/2;
            if(nums[mid] <= pivot) {
                ans = nums[mid];
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
// @lc code=end

