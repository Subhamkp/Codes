/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        int layers = n/2, temp;

        // [1,2,3],
        // [4,5,6],
        // [7,8,9]

        // [7,4,1],
        // [8,5,2],
        // [9,6,3]

		for (int layer = 0; layer < layers; layer++) {
			for (int i = layer; i < n-layer-1; i++) { //remove the top-right corner to skip double swap of corners
				temp = matrix[layer][i];
				matrix[layer][i] = matrix[n - 1 - i][layer];
				matrix[n - 1 - i][layer] = matrix[n - 1 - layer][n - 1 - i];
				matrix[n - 1 - layer][n - 1 - i] = matrix[i][n - 1 - layer];
				matrix[i][n - 1 - layer] = temp;
			}
		}
    }
}
// @lc code=end

