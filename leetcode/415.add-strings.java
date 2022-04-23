/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int n = num1.length() - 1, m = num2.length() - 1;
        int a, b, c = 0;

        String ans="";
        while(n>=0 && m >=0) {
            a = num1.charAt(n) - '0';
            b = num2.charAt(m) - '0';

            ans = (char)((a+b+c)%10 + '0') + ans;
            if(a+b+c > 9) {
                c = 1;
            }
            else {
                c = 0;
            }
            n--;
            m--;
        }

        while(n >=0) {
            a = num1.charAt(n) - '0';
            ans = (char)((a+c)%10 + '0') + ans;
            if(a+c > 9) {
                c = 1;
            }
            else {
                c = 0;
            }
            n--;
        }

        while(m >=0) {
            a = num2.charAt(m) - '0';
            ans = (char)((a+c)%10 + '0') + ans;
            if(a+c > 9) {
                c = 1;
            }
            else {
                c = 0;
            }
            m--;
        }

        if(c > 0) {
            ans = '1' + ans;
        }

        return ans;
    }
}
// @lc code=end

