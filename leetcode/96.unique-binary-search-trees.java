/*
 * @lc app=leetcode id=96 lang=java
 *
 * [96] Unique Binary Search Trees
 */

// @lc code=start
class Solution {

    long binomialCoeff(int n, int k)
    {
        long res = 1;
        if (k > n - k)
            k = n - k;
 
        for (long i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public int numTrees(int n) {
        //catalan number
        long c = binomialCoeff(2*n,n);
        return (int)(c/(n+1));
    }
}
// @lc code=end

