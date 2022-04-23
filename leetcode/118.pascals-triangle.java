/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        int left = -1, right = -1;
        for(int i=0;i < numRows;i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++) {

                if(j-1 < 0 && j+1 > i) {
                    temp.add(1);
                    continue;
                } else if(j-1 < 0) {
                    left = 0;
                    right = res.get(i-1).get(j);
                    temp.add(left + right);
                } else if(j+1 > i) {
                    right = 0;
                    left = res.get(i-1).get(j-1);
                    temp.add(left + right);
                } else {
                    left = res.get(i-1).get(j-1);
                    right = res.get(i-1).get(j);
                    temp.add(left + right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
// @lc code=end

