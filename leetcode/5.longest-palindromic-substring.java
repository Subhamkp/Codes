/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String getModifiedString(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            sb.append("#");
            sb.append(c);
        }
        sb.append("#");
        return sb.toString();
    }

    public String longestPalindrome(String s) {
        String str = getModifiedString(s);

        int n = str.length(), center = 0, right = 0, mirror = 0, a, b, len = 0, ansCenter = 0;
        // babad
        //#a#a# a #a#a#    5 (5) 
        //#a#a # a#a# 4 (4)
        int[] P = new int[2*n];

        for(int i=1; i < n - 1;i++) {
            mirror = 2 * center - i;

            if(right > i) { //part of already computed palindrome 
                P[i] = Math.min(right-i, P[mirror]);
            }

            a = i - 1 - P[i];
            b = i + 1 + P[i]; 
            while(a>=0 && b < n && str.charAt(a) == str.charAt(b)) {
                P[i]++;
                a--;
                b++;
            }

            //check if the expanded palindrome at i is expanding beyond the right boundary of current longest palindrome at center c
            //If it is, the new center is i
            if(i + P[i] > right) {
                center = i;
                right = i + P[i];

                if (P[i] > len) {
                    len = P[i];
                    ansCenter = i;
                }
            }
        }
        ansCenter = (ansCenter - len)/2;
        return s.substring(ansCenter,ansCenter + len);
    }
}
// @lc code=end

