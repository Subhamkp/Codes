/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

// @lc code=start
class Solution {
    int n,m;
    int[][] dr = {{0,1},{1,0},{0,-1},{-1,0}};
    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(board[i][j] == word.charAt(0)) {
                    board[i][j] = '@';
                    if(solve(board,word,i,j,1)) return true;
                    board[i][j] = word.charAt(0);;
                }
            }
        }
        return false;
    }

    private boolean solve(char[][] board, String word, int x, int y, int idx) {
        if(idx == word.length()) {
            return true;
        }
        int p, q;
        for(int[] d : dr) {
            p = x+d[0];
            q = y+d[1];
            if(p>=0 && p<n && q>=0 && q<m && idx < word.length() &&
                board[p][q] == word.charAt(idx)) {
                board[p][q] = '@';
                if(solve(board,word,p,q,idx+1)) return true;
                board[p][q] = word.charAt(idx);
            }
        }
        return false;
    }
}
// @lc code=end

