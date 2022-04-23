/*
 * @lc app=leetcode id=1344 lang=java
 *
 * [1344] Angle Between Hands of a Clock
 */

// @lc code=start
class Solution {
    public double angleClock(int hour, int minutes) {
        //minutes
        //30mins -> 180
        //1mins -> 6 degree

        //hour
        //60mins min = 30degree hand
        //1mins min = 1/2 degree hand

        double hourhand = (hour % 12)*30 + minutes*0.5;
        double minutesHand = minutes*6;
        double degree = Math.abs(hourhand-minutesHand);
        return Math.min(360-degree,degree);

    }
}
// @lc code=end

