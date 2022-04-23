/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        
        int l = 1, r = x, mid, ans = -1;
        while(l <= r) {
            mid = l + (r-l)/2;
            if(mid <= x/mid) {
                ans = mid;
                l = mid + 1;;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
}
// @lc code=end

