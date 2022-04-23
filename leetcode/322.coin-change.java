/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        int n = coins.length;
        
        Arrays.fill(dp,Integer.MAX_VALUE);
        
        dp[0] = 0;
        for(int i=0;i<n;i++){
            for(int j=coins[i];j<=amount;j++){
                if(dp[j-coins[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        
        if(dp[amount] == Integer.MAX_VALUE){
            return -1;
        } else {
            return dp[amount];
        }
    }
}
// @lc code=end

