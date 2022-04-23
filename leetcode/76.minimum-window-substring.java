/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char ch : t.toCharArray()) {
            mp.put(ch,mp.getOrDefault(ch,0) + 1);
        }

        char tempCh;
        int counter = mp.size(), n = s.length();
        int start = 0, end = 0, temp, ansStart = -1, minLength = Integer.MAX_VALUE;

        while(end < n) {
            tempCh = s.charAt(end);
            if(mp.containsKey(tempCh)) {
                temp = mp.get(tempCh);
                mp.put(tempCh,temp-1);
                if(temp-1 == 0) counter--;
            }

            while(counter == 0) { //Till counter == 0, calculate the possible result
                
                if(end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    ansStart = start;
                }
                tempCh = s.charAt(start);
                if(mp.containsKey(tempCh)) {
                    temp = mp.get(tempCh);
                    mp.put(tempCh,temp+1);
                    if(temp + 1 > 0  ) {//temp can be negative
                        counter++;
                    }
                }
                start++;
            }
            end++;
        }
        if(ansStart == -1) return "";
        else return s.substring(ansStart,ansStart+minLength);
    }
}
// @lc code=end

