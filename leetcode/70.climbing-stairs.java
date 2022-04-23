/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if( n < 4) return n;
        int[] dp = new int[4];
        dp[1] = 1;
        dp[2] = 2;

        int i = 3, curr = -1;
        while(i<=n) {
            curr = dp[2];
            dp[2] = dp[1] + dp[2];
            dp[1] = curr;
            i++;
        }
        return dp[2];
    }
}
// @lc code=end

