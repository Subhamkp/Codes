/*
 * @lc app=leetcode id=221 lang=java
 *
 * [221] Maximal Square
 */

// @lc code=start
class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        
        if(n==0) return 0;
        
        int m = matrix[0].length, ans = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0){
                    if(matrix[i][j]=='1' && ans == 0) {
                        ans = 1;
                    }
                    continue;
                }
                
                if(matrix[i][j]=='1'){
                    matrix[i][j] = (char)(Math.min(matrix[i-1][j-1],Math.min(matrix[i-1][j],matrix[i][j-1])) + 1);
                    ans = Math.max(matrix[i][j]-'0',ans);
                }
            }
        }
        return ans*ans;
    }
}
// @lc code=end

