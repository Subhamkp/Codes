/*
 * @lc app=leetcode id=289 lang=java
 *
 * [289] Game of Life
 */

// @lc code=start
class Solution {

    /*
        [2nd bit, 1st bit] = [next state, current state]

        - 00  dead (next) <- dead (current)
        - 01  dead (next) <- live (current)  
        - 10  live (next) <- dead (current)  
        - 11  live (next) <- live (current) 
        
        1. Let's count # of neighbors from 1st state and set 2nd state bit.
        2. Since every 2nd state is by default dead, no need to consider transition 01 -> 00.
        3. In the end, delete every cell's 1st state by doing >> 1.
        
        For each cell's 1st bit, check the 8 pixels around itself, and set the cell's 2nd bit.

        Transition 01 -> 11: when board == 1 and lives >= 2 && lives <= 3. (It remains same but change the 2nd bit as it is 0 by default)
        Transition 00 -> 10: when board == 0 and lives == 3.
        
        To get the current state, simply do
        board[i][j] & 1

        To get the next state, simply do
        board[i][j] >> 1
    */
    int[][] dr = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        int cnt;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                board[i][j] = getCount(board,i,j);
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                board[i][j]>>=1;
            }
        }
    }

    int getCount(int[][] board, int i, int j) {
        
        int p, q, count = 0;
        for(int[] x : dr) {
            p = i+x[0];
            q = j+x[1];

            if((p>=0 && p<board.length) && (q>=0 && q<board[0].length))
                count+=(board[p][q] & 1); // check the 1st bit
        }
      
        //Condition 1 (Skip as 2nd bit is by default 0)
        //Condition 2
        if(board[i][j] == 1 && count >= 2 && count <= 3) return 3; //01 -> 11 (Chnage the by defaut 2nd bit)
        //Condition 3 (Skip as 2nd bit is by default 0)
        //Condition 4
        if(board[i][j] == 0 && count == 3) return 2; //00 -> 10 (Swap as per condition)
        
        //For condition 2/4, 1st bit remains same and 2nd bit is 0
        return board[i][j];
    }
}
// @lc code=end

