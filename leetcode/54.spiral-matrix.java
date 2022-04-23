/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length;

        ArrayList<Integer> ar = new ArrayList<>();
        int up = 0, right = n -1, down = m - 1, left = 0, l = 0;


        // left = 0
        // right = 2
        // down = 1
        // up = 1

        // 1 2 3 4 
        // 5 6 7 8


        // 5 6 7 
        
        

        while(left <= right && up <= down) {
            l = left;
            while(l <= right) {
                ar.add(matrix[up][l++]);
            }
            up++;

            // System.out.println("1 "+ar);

            l = up;
            while(l <= down) {
                ar.add(matrix[l++][right]);
            }
            right--;

            // System.out.println("2 "+ar);


            if(up <= down) {
                l = right;
                while(l >= left) {
                    ar.add(matrix[down][l--]);
                }
            }
            down--;

            // System.out.println("3 "+ar);

            if(left <= right) {
                l = down;
                while(l >= up) {
                    ar.add(matrix[l--][left]);
                }
            }
            left++;

            // System.out.println("4 "+ar);
        }

        return ar;
    }
}
// @lc code=end

