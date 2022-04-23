/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String res = "";
        int n = s.length(),i=0;
        char ch;
        boolean last = false;

        while(i < n) {
            ch = s.charAt(i);
            if(ch == ' ') {
                // System.out.println("res :"+res);
                if(sb.length() != 0) {
                    if(last) res = sb.toString()+ " "+res;
                    else res = sb.toString() + res;
                    // System.out.println("    res:"+res); 
                    sb.setLength(0);
                    last = true;
                }
                while(i < n && s.charAt(i) == ' ') i++; //skip space
            } else {
                // System.out.println("    char i: "+ch+" "+i);
                sb.append(ch);
                i++;
            }   
        }
        if(sb.length() != 0) {
            if(last) res = sb.toString()+ " "+res;
            else res = sb.toString() + res;
        }
        return res;
    }
}
// @lc code=end

