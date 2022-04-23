/*
 * @lc app=leetcode id=402 lang=java
 *
 * [402] Remove K Digits
 */

// @lc code=start
class Solution {
    public String removeKdigits(String s, int k) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        // eg : 1 4 5 6 1 3 1, k = 3
        stack.push(s.charAt(0));
        
        //Sorted digit number is always the smaller one
        //so try to create one and remove k number in between.
        for(int i=1;i<n;i++) {
            char ch = s.charAt(i);
            if(stack.peek() > ch) {
                while(k>0 && !stack.isEmpty() && stack.peek() > ch) {
                    stack.pop();
                    k--;
                }
            }
            stack.push(ch);
        }
        
        
        while(k-- > 0 && !stack.isEmpty()) {
            stack.pop();
        }
        
        if(stack.isEmpty()) 
            return "0";
        
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        result.reverse();
        
        if(result.length() == 1 && result.equals("0")) return "0";
        
        while(result.length() > 1 && result.charAt(0) == '0') 
            result.deleteCharAt(0);
        
        return result.toString();
    }
}
// @lc code=end

