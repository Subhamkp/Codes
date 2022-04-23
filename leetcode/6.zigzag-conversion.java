/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        HashMap<Integer,StringBuilder> mp = new HashMap<>();

        int n = s.length(), curr = 0;
        boolean down = true;
        for(int i=0;i<n;i++) {
            if(down) {
                mp.putIfAbsent(curr,new StringBuilder());
                mp.get(curr).append(s.charAt(i));
                curr++;
                if(curr == numRows) {
                    curr-=2;
                    down=!down;
                }
            } else {
                mp.putIfAbsent(curr,new StringBuilder());
                mp.get(curr).append(s.charAt(i));  
                curr--;
                if(curr == -1) {
                    curr+=2;
                    down=!down;
                }
            }
        }

        String ans = "";
        for(Map.Entry<Integer,StringBuilder> e : mp.entrySet()) {
            ans+=(e.getValue());
        }
        return ans;
    }
}
// @lc code=end

