/*
 * @lc app=leetcode id=1249 lang=java
 *
 * [1249] Minimum Remove to Make Valid Parentheses
 */

// @lc code=start
class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        char[] ch = s.toCharArray();

        for(int i = 0; i < n; i++){
            if(ch[i] == '(') st.push(i);
            else if(ch[i] == ')'){
                if(st.isEmpty()) ch[i] = '#';
                else st.pop();
            }
        }
        while(!st.isEmpty()){
            ch[st.pop()] = '#';
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            if(ch[i] != '#') {
                sb.append(ch[i]);
            }
            
        }
        return sb.toString();
    }
}
// @lc code=end

