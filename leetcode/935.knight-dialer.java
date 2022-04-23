/*
 * @lc app=leetcode id=935 lang=java
 *
 * [935] Knight Dialer
 */

// @lc code=start
// class Solution {
//     int[][] dr = {{4,6},{6,8},{7,9},{4,8},{3,9,0},{},{1,7,0},{2,6},{1,3},{2,4}};
//     int[][] dp;
//     int mod = 1000000007;

//     public int knightDialer(int n) {
//         dp = new int[10][n+1];
//         int cnt = 0;
//         for(int i=0;i<10;i++) cnt = (cnt + solve(i,n-1))%mod;
//         return cnt;
//     }

    
//     int solve(int idx, int n) {
//         // System.out.println("idx n: "+idx+" - "+n);
//         if(n == 0) {
//             // System.out.println("End idx n: "+idx+" - "+n);
//             return 1;
//         }
//         if(dp[idx][n] != 0) {
//             // System.out.println("Already idx n: "+idx+" - "+n);
//             return dp[idx][n];
//         }

//         int sum = 0;
//         for(int x : dr[idx]) {
//             sum = (sum + solve(x,n-1))%mod;
//         }
//         dp[idx][n] = sum;
//         return dp[idx][n];
//     }
// }


class Solution {
    public int knightDialer(int N) {
        if(N==1) return 10;
        long mod = 1000000007;
        long[][] matrix = {
            {0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
            {1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0, 0, 1, 0, 0},                     
            {0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 1, 0, 0, 0, 0, 0},            
        };        
        long[][] resultMatrix = new long[10][10];
        boolean resultNotEmpty = false;
        long res = 0;
        N=N-1;
        while(N>0){
            if(N%2==1){
                if(resultNotEmpty){
                    resultMatrix = matrixMultiply(resultMatrix, matrix);       
                } else {
                    //or initialize with identity matrix
                    resultNotEmpty = true;
                    resultMatrix = matrix;                                   
                }                 
            }
            matrix = matrixMultiply(matrix, matrix);
            N/=2;
        }
        long sum = 0;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                sum = (sum+resultMatrix[i][j])%mod;
            }
        }
        return (int)sum;
        
    }
    private long[][] matrixMultiply(long[][] matrix1, long[][]matrix2){
        long mod = 1000000007;
        long[][] resultMatrix = new long[10][10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                for(int k=0; k<10; k++){
                    resultMatrix[i][j] =  (resultMatrix[i][j]+matrix1[i][k]*matrix2[k][j])%mod;
                }
                
            }
        }  
        return resultMatrix;
    }
}
// @lc code=end

