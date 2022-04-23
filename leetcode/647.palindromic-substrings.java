/*
 * @lc app=leetcode id=647 lang=java
 *
 * [647] Palindromic Substrings
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        //Lets start : 2022-03-06 09:52:14
        int n = s.length(), ans = 0,j;
        boolean dp[][] = new boolean[n+1][n+1];
        for(int i=0;i<n;i++) {
            dp[i][i] = true;
            ans++;
            if(i<n-1) {
                if(s.charAt(i) == s.charAt(i+1)) {
                    ans++;
                    dp[i][i+1] = true;
                }
            }
        }
        
        // a a a a a a a
        // 0 1 2 3 4 5 6
        for(int len = 2;len<n;len++) {
            for(int i=0;i<n-len;i++) {
                j = i + len;
                if(dp[i+1][j-1] && s.charAt(i) == s.charAt(j)) {
                    // System.out.println("i j :"+i+" "+j);
                    dp[i][j] = true; ans++;
                } 
            }
        }
        return ans;
        //Times Up : 2022-03-06 10:02:07
    }
}
// @lc code=end

