/*
 * @lc app=leetcode id=1351 lang=java
 *
 * [1351] Count Negative Numbers in a Sorted Matrix
 */

// @lc code=start
class Solution {


    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length, r = m - 1, c = 0, cnt = 0;
        while (r >= 0 && c < n) {
            if (grid[r][c] < 0) {
                --r;
                cnt += n - c; // there are n - c negative numbers in current row.
            }else {
                ++c;
            }
        }
        return cnt;
    }

    // public int countNegatives(int[][] grid) {
    //     int l, r, mid, res = 0, ans;
    //     for(int[] ar : grid) {
    //         l = 0;
    //         r = ar.length - 1;
    //         ans = -1;

    //         while(l<=r) {
    //             mid = l + (r-l)/2;
    //             if(ar[mid] < 0) {
    //                 ans = mid;
    //                 r = mid - 1;
    //             } else {
    //                 l = mid + 1;
    //             }
    //         }

    //         if(ans != -1) res+=(ar.length - ans);
    //     }
    //     return res;
    // }
}
// @lc code=end

