/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        int[] result = new int[2];
        for(int i=0;i<n;i++) {
            Object idx = mp.get(target-nums[i]);
            if(idx == null) {
                mp.put(nums[i],i);
            } else {
                result[0] = i;
                result[1] = (int)idx;
                return result;
            }
        }
        return result;
    }
}
// @lc code=end

