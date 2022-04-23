/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0, maj = -1;
        for(int x : nums) {
            if(cnt == 0) {
                maj = x;
            }

            if(x == maj) cnt++;
            else cnt--;
        }
        return maj;
    }
}
// @lc code=end

