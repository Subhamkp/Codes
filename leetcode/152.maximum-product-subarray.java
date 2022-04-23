/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] A) {
        int n = A.length, res = A[0], l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            l =  (l == 0 ? 1 : l) * A[i]; //to consider the last odd count negative
            r =  (r == 0 ? 1 : r) * A[n - 1 - i]; //to consider the first odd count negative
            res = Math.max(res, Math.max(l, r));
        }
        return res;
    }
}
// @lc code=end

