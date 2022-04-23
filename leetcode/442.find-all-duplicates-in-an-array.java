/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int idx;
        for(int i=0;i<nums.length;i++) {
            idx = Math.abs(nums[i])-1;
            if(nums[idx] < 0) res.add(Math.abs(nums[i]));
            else {
                nums[idx] = -1*nums[idx];
            }
        }
        return res;
    }
}
// @lc code=end

