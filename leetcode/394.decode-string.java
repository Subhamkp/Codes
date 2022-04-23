/*
 * @lc app=leetcode id=394 lang=java
 *
 * [394] Decode String
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        int n = s.length(),idx=0;
        StringBuilder res = new StringBuilder();
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();

        while(idx<n) {
            if(s.charAt(idx) == '[') {
                resStack.push(res.toString()); //Save the string till time
                res.setLength(0);
                idx++;
            }
            else if(Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            } else if(s.charAt(idx)  == ']') {
                StringBuilder temp = new StringBuilder (resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res); //res is the string between the [] and add it to res.
                }
                res = temp;
                idx++;
                
            } else {
                res.append(s.charAt(idx++));
            }
        }
        return res.toString();
    }
}
// @lc code=end

