/*
 * @lc app=leetcode id=997 lang=java
 *
 * [997] Find the Town Judge
 */

// @lc code=start
class Solution {
    public int findJudge(int n, int[][] trust) {        
        int[] mp = new int[n+1];
        for(int[] row : trust) {
            mp[row[0]]--; //Outgoing(for judge, decrementing the outgoing)
            mp[row[1]]++; //Incoming(for judge there should be only n-1)
        }
        
        for(int i=1;i<=n;i++) {
            if(mp[i] == (n-1)) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

