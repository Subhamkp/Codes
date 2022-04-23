/*
 * @lc app=leetcode id=1423 lang=java
 *
 * [1423] Maximum Points You Can Obtain from Cards
 */

// @lc code=start
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, res;
        for(int i=1;i<n;i++) {
            cardPoints[i]+=cardPoints[i-1];
        }
        // 0 1 2  3  4  5  6
        // 1 3 6 10 15 21 22

        if(k == n) {
            return cardPoints[n-1];
        }

        res = cardPoints[n-1] - cardPoints[n-1-k];
        for(int i=0;i<k;i++) {
            res = Math.max(res,cardPoints[i]  + (cardPoints[n-1] - cardPoints[n-1-k+i+1]));
        }
        return res;
    }
}
// @lc code=end

