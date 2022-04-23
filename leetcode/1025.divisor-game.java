/*
 * @lc app=leetcode id=1025 lang=java
 *
 * [1025] Divisor Game
 */

// @lc code=start
class Solution {
    /*
    My proof : Base case is n = 2 in that case player wins. So at every step Alice will try to give to Bob odd number and have even number for herself, because from odd number you can have only even number, if you follow rules of the problem. So at each step Bob will have odd number, and after his turn Alice will always have even number. So at the end Alice will have 2 and wins. So this logic can can be profitable for Alice if she have even number at first step. So having even number at first step guarantees that she will win, because at every step she will transform number to odd number and have even number for her turn, but Bob will have no chance to win, because any transformation on his turn will give only even number.
    But if the n is odd at first step, so as we discussed above, it will give only even number, so after first step Bob will have even number, and after that he will follow the rule above (will transform it to odd number) and win.
    */
    public boolean divisorGame(int n) {
        return n%2==0;
    }
}
// @lc code=end

