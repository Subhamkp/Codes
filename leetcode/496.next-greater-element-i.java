/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;

        int[] res = new int[n];
        int[] ans = new int[nums1.length];
        int[] idx = new int[10005];

        for(int i=n-1;i>=0;i--) {
            idx[nums2[i]]=i;
            while(!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++) ans[i] = res[idx[nums1[i]]];
        return ans;
        
    }
}
// @lc code=end

