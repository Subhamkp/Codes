/*
 * @lc app=leetcode id=1673 lang=java
 *
 * [1673] Find the Most Competitive Subsequence
 */

// @lc code=start
class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[k];
        for (int i = 0; i < nums.length; i++) {
            while (!stack.empty() && nums[i] < stack.peek() && nums.length - i + stack.size() > k) {
                stack.pop();
            }
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
// @lc code=end

