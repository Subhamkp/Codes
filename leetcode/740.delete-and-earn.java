/*
 * @lc app=leetcode id=740 lang=java
 *
 * [740] Delete and Earn
 */

// @lc code=start
class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        for(int x : nums) values[x]+=x;

        int prev1=0,prev2=0,curr=0;
        for(int i=0;i<n;i++) {
            curr = Math.max(prev2+values[i],prev1);
            prev2 = prev1;
            prev1 = curr;
            
        }
        return curr;
    }
}
// @lc code=end

