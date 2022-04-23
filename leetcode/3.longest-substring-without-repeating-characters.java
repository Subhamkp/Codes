/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0, start = 0, end = 0;
        while (end < s.length()){
            if (map.containsKey(s.charAt(end))){
                start = Math.max(start,map.get(s.charAt(end))+1);
            }
            max = Math.max(max,end-start+1);
            map.put(s.charAt(end),end);
            end++;
        }
        return max;
    }
}
// @lc code=end

