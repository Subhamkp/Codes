/*
 * @lc app=leetcode id=628 lang=java
 *
 * [628] Maximum Product of Three Numbers
 */

// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        int a, b, c, p, q, mx, y;
        a = b = c = Integer.MIN_VALUE;
        p = q = Integer.MAX_VALUE;

        for(int x : nums) {

            if(x > a) {
                c = b;
                b = a;
                a = x;
            } else if(x > b) {
                c = b;
                b = x;
            } else if(x > c) {
                c = x;
            }

            if(x < p) {
                q = p;
                p = x;
            } else if(x < q) {
                q = x;
            }
        }
        return Math.max(p*q*a,a*b*c);
    }
}
// @lc code=end

