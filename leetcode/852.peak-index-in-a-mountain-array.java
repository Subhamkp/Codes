/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length - 1, ans = -1, mid;
        while(l <= r) {
            mid = l + (r-l)/2;
            if(mid == 0 || arr[mid] > arr[mid - 1]) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
// @lc code=end

