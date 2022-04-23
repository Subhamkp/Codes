/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0 , end = 0, n = nums.length;

        while(end < n) {
            if(start == 0) {
                start++;
                end++;
            }
            else {
                while(end < n && nums[end] == nums[start - 1]) end++;
                if(end < n) nums[start++] = nums[end++];
            }
        }
        return start;
    }
}
// @lc code=end

