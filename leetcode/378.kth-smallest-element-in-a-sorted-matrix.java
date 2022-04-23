/*
 * @lc app=leetcode id=378 lang=java
 *
 * [378] Kth Smallest Element in a Sorted Matrix
 */

// @lc code=start
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int lo = matrix[0][0], hi = matrix[matrix.length - 1][matrix[0].length - 1];
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            //Count points that are less than mid
            int count = 0,  j = matrix[0].length - 1;
            for(int i = 0; i < matrix.length; i++) {
                while(j >= 0 && matrix[i][j] > mid) j--;
                count += (j + 1);
            }

            if(count < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }
}
// @lc code=end

