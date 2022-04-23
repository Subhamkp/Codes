/*
 * @lc app=leetcode id=1465 lang=java
 *
 * [1465] Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts
 */

// @lc code=start
class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int n = horizontalCuts.length, m = verticalCuts.length;

        //Corner Areas
        long hor = Math.max(horizontalCuts[0]-0,h-horizontalCuts[n-1]);
        long ver = Math.max(verticalCuts[0]-0,w-verticalCuts[m-1]);

        for(int i=1;i<n;i++) {
            hor = Math.max(hor,horizontalCuts[i]-horizontalCuts[i-1]);
        }

        for(int i=1;i<m;i++) {
            ver = Math.max(ver,verticalCuts[i]-verticalCuts[i-1]);
        }

        return (int)((hor*ver)%1000000007);
    }
}
// @lc code=end

