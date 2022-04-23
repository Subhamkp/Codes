/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, n = prices.length;
        for(int i=1;i<n;i++) {
            if(prices[i] > prices[i-1]) {
                res+=(prices[i]-prices[i-1]);
            }
        }
        return res;
    }
}
// @lc code=end

