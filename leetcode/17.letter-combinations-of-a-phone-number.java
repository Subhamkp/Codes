/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    HashMap<Character,char[]> mp;
    List<String> res;
    String digits;
    int n;

    public List<String> letterCombinations(String digits) {
        mp = new HashMap<>();
        res = new ArrayList<>();
        this.digits = digits;
        n = digits.length();
        
        if(n == 0) return res;

        mp.put('2',new char[]{'a','b','c'});
        mp.put('3',new char[]{'d','e','f'});
        mp.put('4',new char[]{'g','h','i'});
        mp.put('5',new char[]{'j','k','l'});
        mp.put('6',new char[]{'m','n','o'});
        mp.put('7',new char[]{'p','q','r','s'});
        mp.put('8',new char[]{'t','u','v'});
        mp.put('9',new char[]{'w','x','y','z'});

        StringBuilder sb = new StringBuilder();
        solve(0,sb);
        return res;
    }

    void solve(int idx, StringBuilder curr) {
        if(idx == n) {
            res.add(curr.toString());
            return;
        }

        for(char c : mp.get(digits.charAt(idx))) {
            curr.append(c);
            solve(idx+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }

    
}
// @lc code=end

