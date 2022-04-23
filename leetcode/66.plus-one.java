/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n - 1] == 9) {
            ArrayList<Integer> li = new ArrayList<>();

            int carry = 1;
            for(int i=n-1;i>=0;i--) {
                li.add((digits[i] + carry)% 10);

                if(digits[i] + carry > 9) carry = 1;
                else carry = 0; 
            }
            if(carry > 0) li.add(carry);

            int m = li.size();
            int[] res = new int[m];
            for(int i=0;i<m;i++) {
                res[i] = li.get(m-i-1);
            }
            return res;

        } else {
            digits[n - 1]+=1;
            return digits;
        }
    }
}
// @lc code=end

