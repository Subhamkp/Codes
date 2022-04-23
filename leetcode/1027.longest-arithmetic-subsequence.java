/*
 * @lc app=leetcode id=1027 lang=java
 *
 * [1027] Longest Arithmetic Subsequence
 */

// @lc code=start
class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>[] mp = new HashMap[n];

        int ans = 2, diff = 0, prev = 0;

        for(int i=0;i<n;i++) {
            mp[i] = new HashMap<>();
            for(int j=0;j<i;j++) {
                diff = nums[i] - nums[j];
                prev = mp[j].getOrDefault(diff,1);
                mp[i].put(diff,prev+1);
                ans = Math.max(prev+1,ans);
            }
        }
        return ans;
    }
}
// @lc code=end

