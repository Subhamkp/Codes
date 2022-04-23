/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        
        int n = intervals.length, prev = 0;
        for(int i = 1;i<n;i++) {
            if(intervals[prev][1] >= intervals[i][0]) {
                intervals[prev][1] = Math.max(intervals[prev][1],intervals[i][1]);
            } else {
                prev++;
                intervals[prev] = intervals[i];
            }
        }

        int[][] res = new int[prev+1][2];
        for(int i=0;i<=prev;i++) {
            res[i] = intervals[i];
        }
        return res;
    }
}
// @lc code=end

