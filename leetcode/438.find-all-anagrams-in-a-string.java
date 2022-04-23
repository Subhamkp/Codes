/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if(p.length() > s.length()) return res;
        
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c : p.toCharArray()) {
            mp.put(c,mp.getOrDefault(c,0) + 1);
        }

        int start = 0, end = 0, prev = 0, head = 0, counter = mp.size();
        int n = s.length(), len = p.length();
        char ch;

        while(end < n) {
            ch = s.charAt(end);
            if(mp.containsKey(ch)) {
                prev = mp.get(ch);
                mp.put(ch,prev - 1);
                if(prev - 1 == 0) counter--;        
            }
            end++;


            while(counter == 0) {
                if(end - start == len) {
                    len = end - start;
                    head = start;
                    res.add(head);
                }

                ch = s.charAt(start);
                if(mp.containsKey(ch)) {
                    prev = mp.get(ch);
                    mp.put(ch,prev + 1);
                    if(prev + 1 == 1) counter++;
                }
                start++;
            }
        }
        return res;
    }
}
// @lc code=end

