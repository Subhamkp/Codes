/*
 * @lc app=leetcode id=343 lang=java
 *
 * [343] Integer Break
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {
        //11
        // 2 + 3 + 3 + 3 
        //15
        // 3 3 3 3 3 3 
        if(n == 2) return 1;
        if(n == 3) return 2;
        int res = 1;
        while(n>3) {
            res*=3;
            n-=3;
        }
        if(n == 1) {
            res/=3;
            res*=4;
        }
        else if(n!=0) res*=n;
        return res;
    }
}
// @lc code=end

