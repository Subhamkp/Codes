/*
 * @lc app=leetcode id=953 lang=java
 *
 * [953] Verifying an Alien Dictionary
 */

// @lc code=start
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n = words.length;
        boolean ans = true;
        for(int i=1;i<n;i++) {
            ans = ans && compare(words[i-1],words[i],order);
        }
        return ans;
    }

    boolean compare(String a, String b, String c) {
        int n = a.length(), m = b.length(), i = 0;
        char p, q;
        while(i<n && i<m) {
            p = a.charAt(i);
            q = b.charAt(i);
            if(p != q) {
                return c.indexOf(p) < c.indexOf(q);
            }
            i++;
        }
        return m >= n;
    }
}
// @lc code=end

