/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        int rem, sum;
        while(true) {
            rem = 0;
            sum = 0;
            while(n>0) {
                rem = n%10;
                sum+=(rem*rem);
                n/=10;
            }

            // 7 -> 49 -> 97(16+81) -> 130(81+49) -> 10(1+9+0) -> 1(1+0) 
            if(sum < 10) return sum == 1 || sum == 7;
            n = sum; 
        }
    }
}
// @lc code=end

