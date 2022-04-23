/*
 * @lc app=leetcode id=523 lang=java
 *
 * [523] Continuous Subarray Sum
 */

// @lc code=start
class Solution {
    public boolean checkSubarraySum(int[] A, int K) {
        Map<Long, Integer> seen = new HashMap<>();
        seen.put(0L, -1);
        long prefix = 0;
        for (int i=0;i<A.length;i++) {
            prefix = (prefix + A[i] % K + K) % K;
            if(!seen.containsKey(prefix)) seen.put(prefix,i);
            if(i - seen.get(prefix) > 1) return true;
        }
        return false;
    }
}
// @lc code=end

