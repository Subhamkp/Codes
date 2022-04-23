/*
 * @lc app=leetcode id=304 lang=java
 *
 * [304] Range Sum Query 2D - Immutable
 */

// @lc code=start
class NumMatrix {

    int[][] resMatrix;
    public NumMatrix(int[][] matrix) {
        
        int n = matrix.length, m = matrix[0].length;
        for(int i=1;i<m;i++) matrix[0][i]+=matrix[0][i-1];
        for(int i=1;i<n;i++) matrix[i][0]+=matrix[i-1][0];

        for(int i=1;i<n;i++) {
            for(int j=1;j<m;j++) {
                matrix[i][j]+=matrix[i-1][j] + matrix[i][j-1] - matrix[i-1][j-1];
            }
        }
        resMatrix = matrix;

        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<m;j++) {
        //         System.out.print(": "+matrix[i][j]);
        //     }
        //     System.out.println("");
        // }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int upperRight = row1 > 0 ? resMatrix[row1-1][col2] : 0;
        int upperLeft = row1 > 0 && col1 > 0 ? resMatrix[row1-1][col1-1] : 0;
        int lowerLeft = col1 > 0 ? resMatrix[row2][col1-1] : 0;
        return resMatrix[row2][col2] - upperRight - lowerLeft + upperLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
// @lc code=end

