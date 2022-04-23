/*
 * @lc app=leetcode id=395 lang=java
 *
 * [395] Longest Substring with At Least K Repeating Characters
 */

// @lc code=start
class Solution {
    public int longestSubstring(String s, int k) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c : s.toCharArray()) {
            mp.put(c,0);
        }

        int start = 0, end = 0, n = s.length(), counter = mp.size(), ans = 0;
        char ch;
        System.out.println("Counter :"+counter);
        while(end < n) {
            ch = s.charAt(end);
            mp.put(ch,mp.get(ch)+1);
            if(mp.get(ch) == k) counter--;

            while(counter == 0) {
                ans = Math.max(ans,end-start+1);
                System.out.println("Ans :"+ans);
                ch = s.charAt(start++);
                mp.put(ch,mp.get(ch)-1);
                if(mp.get(ch) < k) counter++;
            }
            end++;
        }
        return ans;
    }
}
// @lc code=end

