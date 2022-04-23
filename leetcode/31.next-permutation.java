/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        // 1 2 3 4 5 10 9 8 7
        // Solution:
        // 1 2 3 4 7 10 9 8 5
        // 1 2 3 4 7  5 8 9 10

        int n = nums.length, i, j;
        
        i = n - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) i--; // Find 1st id i that breaks descending order

        //Check if it is not of type decreasing sequence i.e [3,2,1]
        if(i >= 0 ) {
            j = n - 1;    // Start from the end
            while(nums[j] <= nums[i]) j--;  // Find rightmost first larger id j i.e first larger than 5 in above example from right is 7
            swap(nums, i, j);            // Swap i and j
        }

        // Reverse the descending sequence
        reverse(nums, i + 1, n - 1);       
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void reverse(int[] nums, int i, int j) {
        while(i < j) swap(nums, i++, j--);
    }
}
// @lc code=end

