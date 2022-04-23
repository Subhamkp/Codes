/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        //https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/
        //RRRRRRRDDDDDDD
        // (m+n-2) C (m-1) or (m+n-2) C (n-1)
        if(m > n) {
            m = m^n;
            n = m^n;
            m = m^n;
        }
        
        int p = (m+n-2);
        int q = n;
        int r = m-1, j = 1;
        
        long res = 1;
        for(int i=q;i<=p;i++) {
            res = res*i;
            if(j<=r) {
                res = res/j;
                j++;
            }
        }

        while(j<=r) {
            res = res/j;
            j++;
        }

        return (int)res;
    }
}
// @lc code=end

