/*
 * @lc app=leetcode id=435 lang=java
 *
 * [435] Non-overlapping Intervals
 */

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[1]-b[1]);

        //[0,2],[1,3],[2,4],[3,5],[4,6]
        //
        int start = 0, end = 1, count = 1, n = intervals.length;
        while(end < n) {
            if(intervals[start][1] <= intervals[end][0]) {
                start = end;
                count++;
            }
            end++;
        }
        return n - count;
    }
}
// @lc code=end

