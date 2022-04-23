/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        int temp;
        for(int i=2;i<=n;i++){
            temp = (s.charAt(i-2)-'0')*10 + (s.charAt(i-1)-'0');
            //can be formed from single digit
            if(s.charAt(i-1) != '0') {
                dp[i]+=dp[i-1];
            }

            //can be formed from double digit
            if(s.charAt(i-2) != '0' && temp<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
// @lc code=end

