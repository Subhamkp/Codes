/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        boolean neg = false;
        long N = n;
        if(n < 0) {
            neg = true;
            N = -1*N;
        }
        while(N>0) {
            if(N%2 == 1) 
                res = res * x;
            N/=2;
            x = x*x;
        }
        return neg ? 1/res : res;
    }
}
// @lc code=end

