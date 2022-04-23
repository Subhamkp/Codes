/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        char prev = '@';
        int res = 0;
        
        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        for(char c : s.toCharArray()) {
            if(prev == 'I' && (c == 'V' || c =='X')) {
                res-=2;
            }
            else if(prev == 'X' && (c == 'L' || c =='C')) {
                res-=20;
            } 
            else if(prev == 'C' && (c == 'D' || c =='M')) {
                res-=200;
            }

            res+=mp.get(c);
            prev = c;
        }

        return res;
    }
}
// @lc code=end

