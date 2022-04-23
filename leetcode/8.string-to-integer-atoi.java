/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        int n = s.length(), i = 0, sign = -2;
        char ch;
        long res = 0;

        //case 1
        while(i< n && s.charAt(i) == ' ') i++;
        
        //case 2
        if(i < n && s.charAt(i) == '+') {
            sign = 1;
            i++;
        }
        else if(i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        // System.out.println("s.charAt(i) : "+s.charAt(i));
        if(i < n && s.charAt(i) == '+') {
            return 0;
        }
        else if(i < n && s.charAt(i) == '-') {
            return 0;
        }

        //case 3
        while(i<n) {
            ch = s.charAt(i);
            // System.out.println("ch res : "+ch+" "+res);

            if(ch >='0' && ch <= '9') {
                res = res*10 + (ch-'0');
                if(res*(sign == -2 ? 1 : sign) > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                else if(res*(sign == -2 ? 1 : sign) < Integer.MIN_VALUE) return Integer.MIN_VALUE;  
            } else {
                res = res*(sign == -2 ? 1 : sign);
                return (int)res;
            }
            // System.out.println("ch res : "+ch+" "+res);
            i++;
        }

        res = res*(sign == -2 ? 1 : sign);
        return (int)res;
    }
}
// @lc code=end

