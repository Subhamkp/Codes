/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        int n = path.length();
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char ch;

        for(int i=0;i<n;i++) {
            ch = path.charAt(i);
            if(ch == '/') {
                if(sb.length() != 0) {
                    if(sb.toString().equals("..")) {
                        if(!st.isEmpty()) st.pop();
                    } else if(sb.toString().equals(".")){
                        //Nothing
                    } else {
                        st.push(sb.toString());
                    }
                    sb.setLength(0);
                }
            } else sb.append(ch);
        }

        if(sb.length() != 0) {
            if(sb.toString().equals("..")) {
                if(!st.isEmpty()) st.pop();
            } else if(sb.toString().equals(".")){
                //Nothing
            } else {
                st.push(sb.toString());
            }
            sb.setLength(0);
        }

        String res = "";
        if(st.size() > 0) {
            while(!st.isEmpty()) {
                res = "/"+st.pop()+res;
            }
        } else res = "/";
        return res;
    }
}
// @lc code=end

