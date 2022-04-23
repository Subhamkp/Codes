/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start
class Solution {

    List<List<String>> res;
    List<String> ar;

    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        ar = new ArrayList<>();

        solve(0,s);

        return res;
    }

    void solve(int idx, String s) {

        if(idx == s.length()) {
            res.add(new ArrayList<>(ar));
            return;
        }

        for(int i=idx;i<s.length();i++) {
            if(palin(s,idx,i)) {
                ar.add(s.substring(idx,i+1));
            
                solve(i+1, s);
            
                ar.remove(ar.size()-1);
            }
        }
    }

    boolean palin(String s, int l, int r) {
        while(l<=r) if(s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }
}
// @lc code=end

