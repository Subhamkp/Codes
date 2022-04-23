/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length, idx;
        
        int dp[] = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);

        for(int i=0;i<n;i++) {
            idx = lower(dp,nums[i]);
            dp[idx] = nums[i];
        }
        return lower(dp,Integer.MAX_VALUE);
    }

    int lower(int[] dp, int x) {
        int l = 0, r = dp.length-1, mid = -1, ans = -1;
        while(l<=r) {
            mid = (l+r)/2;
            if(dp[mid] >= x) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
// @lc code=end

