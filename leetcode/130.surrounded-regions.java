/*
 * @lc app=leetcode id=130 lang=java
 *
 * [130] Surrounded Regions
 */

// @lc code=start
class Solution {
    char[][] board;
    int[][] dr = {{0,1},{1,0},{-1,0},{0,-1}};
    int x, y,n,m;
    public void dfs(int i, int j) {
        board[i][j] = 'P';
        for(int[] d : dr) {
            x = d[0]+i;
            y = d[1]+j;
            if(x>=0 && x<n && y>=0 && y<m && board[x][y] == 'O') {
                dfs(x,y);
            }
        }
    }

    public void solve(char[][] board) {
        this.board = board;
        n = board.length;
        m = board[0].length;

        for(int i=0;i<m;i++) {
            if(board[0][i] == 'O') dfs(0,i);
            if(board[n-1][i] == 'O') dfs(n-1,i);
        }

        for(int i=0;i<n;i++) {
            if(board[i][0] == 'O') dfs(i,0);
            if(board[i][m-1] == 'O') dfs(i,m-1);
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if(board[i][j] == 'P') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
// @lc code=end

