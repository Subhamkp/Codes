/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        
        int l = 0, r = s.length() - 1, p, q;
        boolean possible = false;
        
        while(l <= r) {
            if(s.charAt(l) != s.charAt(r)) {
                
                if(r-1 >=0 && s.charAt(l) == s.charAt(r-1)) {
                    p = l;
                    q = r-1;
                    while(p<=q && s.charAt(p++) == s.charAt(q--));
                    possible = possible || (p>q); 
                }    

                if(!possible && l+1 < s.length() && s.charAt(l+1) == s.charAt(r)) {
                    p = l+1;
                    q = r;
                    while(p<=q && s.charAt(p++) == s.charAt(q--));
                    possible = possible || (p>q); 
                }

                return possible;  
            }
            l++;
            r--;
        }
        return true;
    }

    boolean isPalindrome(String s, int p, int q) {
        while(p<=q && s.charAt(p++) == s.charAt(q--));
        return p>q;
    }
}
// @lc code=end

