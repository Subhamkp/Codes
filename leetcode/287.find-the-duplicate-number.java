/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int l = 1, r = nums.length - 1, ans = -1;
        while (l <= r) {
            int mid = (int) (l + (r - l)/2);
            int cnt = 0;
            for (int a : nums) {
                if (a <= mid) ++cnt;
            }
            if (cnt <= mid) {
                l = mid + 1;
            }
            else {
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
}
// @lc code=end

