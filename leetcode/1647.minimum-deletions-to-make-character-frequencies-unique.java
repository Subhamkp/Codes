/*
 * @lc app=leetcode id=1647 lang=java
 *
 * [1647] Minimum Deletions to Make Character Frequencies Unique
 */

// @lc code=start
class Solution {
    public int minDeletions(String s) {
        int[] dp = new int[26];
        for(char c : s.toCharArray()) {
            dp[c-'a']++;
        }

        Arrays.sort(dp);

        int temp, res = 0;
        for(int i=25;i>=0;i--) {
            if(dp[i] == 0) {
                while(i-1>=0 && dp[i-1] != 0) { res+=dp[i-1]; i--;} 
                break;
            }
            if(i-1>=0 && dp[i-1] >= dp[i]) {
                temp = dp[i-1] - dp[i] + 1;
                res+=temp;
                dp[i-1]-=temp;
            }
        }
        return res;
    }
}
// @lc code=end

