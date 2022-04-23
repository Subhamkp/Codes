/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closet = nums[0]+nums[1]+nums[2];
        for(int left=0; left<nums.length; left++)
        {
            int mid = left+1; 
            int right = nums.length-1;
            while(mid<right)
            {
                int sum = nums[left]+nums[mid]+nums[right];
                if(Math.abs(sum-target)<Math.abs(closet-target))
                    closet = sum;
                
                if(sum>target)
                    right--;
                else if(sum<target)                  
                    mid++;
                else
                    return sum;
            }
        }
        return closet;
    }
}
// @lc code=end

