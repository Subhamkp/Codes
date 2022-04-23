/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int mn = Integer.MAX_VALUE, res = 0;
        for(int x : prices) {
            mn = Math.min(x,mn);
            res = Math.max(res,x-mn);
        }
        return res;
    }
}
// @lc code=end

