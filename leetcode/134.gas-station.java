/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution {
    //If we run out of fuel say at some ith gas station, then all the gas station between ith and starting point are bad starting point as well.
    //If the overall surplus is positive, then there exist a solution

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total_surplus = 0; // it will give us a difference b/w gas & cost
        int surplus = 0;// our tank
        int start = 0; // and the index of gas station
        
        for(int i = 0; i < n; i++){
            total_surplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if(surplus < 0){ // if the tank goes -ve
                surplus = 0; // reset our tank
                start = i + 1; // and update the stating gas station
            }
        }
        return (total_surplus < 0) ? -1 : start;
    }
}
// @lc code=end

