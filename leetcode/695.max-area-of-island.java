/*
 * @lc app=leetcode id=695 lang=java
 *
 * [695] Max Area of Island
 */

// @lc code=start
class Solution {
    int n, m,x,y;
    int[][] dr = {{0,1},{1,0},{0,-1},{-1,0}};

    public int maxAreaOfIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        int res = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 1) {
                    grid[i][j] = 0;
                    res = Math.max(res,count(grid,i,j)+1);
                }
            }
        }
        return res;
    }

    int count(int[][] grid, int i, int j) {
        int sum = 0;
        for(int[] d : dr) {
            x = i+d[0];
            y = j+d[1];
            if(x>=0 && x< n && y>=0 && y<m && grid[x][y] == 1) {
                grid[x][y] = 0;
                sum = sum + 1 + count(grid,x,y); 
            }
        }
        return sum;
    }
}
// @lc code=end

