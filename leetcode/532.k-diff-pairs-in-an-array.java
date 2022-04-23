/*
 * @lc app=leetcode id=532 lang=java
 *
 * [532] K-diff Pairs in an Array
 */

// @lc code=start
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }
        int res = 0;
        for (int x : cnt.keySet()) {
            if ((k > 0 && cnt.containsKey(x + k)) || (k == 0 && cnt.get(x) > 1)) {
                res++;
            }
        }
        return res;
    }
}
// @lc code=end

