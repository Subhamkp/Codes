/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> st = new HashSet<>();
        Set<Integer> wordLens = new HashSet<>();

        for(String str : wordDict) {
            st.add(str);
            wordLens.add(str.length());
        }

        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        //leetcode
        for(int i=1;i<=n;i++) {
            for(Integer x : wordLens) {
                if(i>=x) {
                    if(dp[i-x] && st.contains(s.substring(i-x,i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[n];
    }
}
// @lc code=end

