/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};

        int l = 0, mid , r = nums.length - 1;
        while(l<=r) {
            mid = l + ((r-l) >> 1);
            if(nums[mid] == target) {
                ans[1] = mid;
                l = mid + 1;
            }
            else if(nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }

        l = 0;
        r = nums.length - 1;
        while(l<=r) {
            mid = l + ((r-l) >> 1);
            if(nums[mid] < target) {
                l = mid + 1;
            } else if(nums[mid] == target){
                ans[0] = mid;
                r = mid -1;
            } else {
                r = mid -1;
            }
        }

        return ans;
    }
}
// @lc code=end

