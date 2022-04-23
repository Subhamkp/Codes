/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

// @lc code=start
class Solution {
    boolean match(char c, char d) {
        if(c == '(') return d == ')';
        return false;
    }

    public int longestValidParentheses(String s) {
        String s = ")()())";

        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<=n;i++) dp[i][i] = 0;
        for(int i=0;i<=n-1;i++) {
            if(match(s.charAt(i) , s.charAt(i+1))) {
                dp[i][i+1] = ;
            }
        }

        for(int k=2;k<=n;k++) {
            for(int i=1;i<=n-k;i++) {
                int j = i+k;
                if(s.charAt(i-1) == s.charAt(j-1) && dp[i-1][j-1])
            }
        }
    }
}
// @lc code=end

