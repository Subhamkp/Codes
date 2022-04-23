/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {

    public boolean backspaceCompare(String s, String t) {
        if(s.equals(t)) return true;

        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();        

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != '#') {
                sb.append(s.charAt(i));
            } else if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
            i++;
        }

        i = 0;
        while (i < t.length()) {
            if (t.charAt(i) != '#') {
                tb.append(t.charAt(i));
            } else if (tb.length() > 0) {
                tb.delete(tb.length() - 1, tb.length());
            }
            i++;
        }

        return sb.toString().equals(tb.toString());
    }

    // public boolean backspaceCompare(String s, String t) {
    //     Stack<Character> s1 = new Stack<>();
    //     Stack<Character> s2 = new Stack<>();

    //     for(char c : s.toCharArray()) {
    //         if(c == '#') {
    //             if(!s1.isEmpty()) s1.pop();
    //             continue;
    //         }
    //         s1.push(c);
    //     }

    //     for(char c : t.toCharArray()) {
    //         if(c == '#') {
    //             if(!s2.isEmpty()) s2.pop();
    //             continue;
    //         }
    //         s2.push(c);
    //     }

    //     while(!s1.isEmpty() && !s2.isEmpty()) {
    //         if(s1.pop() != s2.pop()) return false;
    //     }
    //     return s1.isEmpty() && s2.isEmpty();
    // }
}
// @lc code=end

