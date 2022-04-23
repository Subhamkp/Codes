/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid, ans = -1;
        while(l <= r) {
            mid = l + (r-l)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
// @lc code=end

