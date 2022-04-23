/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int n = a.length() - 1, m = b.length() - 1;
        int p, q, carry = 0;
        
        String res="";
        while(n>=0 && m>=0) {
            p = a.charAt(n) - '0';
            q = b.charAt(m) - '0';

            res=(char)((p+q+carry)%2 + '0')+res;

            if(p+q+carry > 1) carry = 1;
            else carry = 0;
            n--;
            m--;
        }

        while(n>=0) {
            p = a.charAt(n) - '0';
            res=(char)((p+carry)%2 + '0')+res;

            if(p+carry > 1) carry = 1;
            else carry = 0;
            n--;
        }

        while(m>=0) {
            q = b.charAt(m) - '0';

            res = (char)((q+carry)%2 + '0') + res;

            if(q+carry > 1) carry = 1;
            else carry = 0;
            m--;
        }
        if(carry > 0) res = ('1') + res;
        return res;
    }
}
// @lc code=end

