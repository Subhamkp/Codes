/*
 * @lc app=leetcode id=1130 lang=java
 *
 * [1130] Minimum Cost Tree From Leaf Values
 */

// @lc code=start
class Solution {
    int ans = -1;
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(Integer.MAX_VALUE);

        int mid = -1, res = 0;
        for(int x : arr) {
            while(st.peek() <= x) {
                mid = st.pop();
                //Cost of removing a smaller element is the elememt * (Minimum of next greater element on left and right)
                res+=(mid*Math.min(st.peek(),x));
            }
            st.push(x);
        }

        while(st.size() > 2) {
            res+=(st.pop()*st.peek());
        }
        return res;
    }
}
// @lc code=end

