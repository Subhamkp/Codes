/*
 * @lc app=leetcode id=1425 lang=java
 *
 * [1425] Constrained Subsequence Sum
 */

// @lc code=start
class Solution {
    public int constrainedSubsetSum(int[] A, int k) {
        int res = A[0];
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < A.length; ++i) {
            A[i] += !q.isEmpty() ? q.peekFirst() : 0;
            res = Math.max(res, A[i]);
            while (!q.isEmpty() && A[i] > q.peekLast())
                q.pollLast();
            if (A[i] > 0)
                q.addLast(A[i]);
            if (i >= k && !q.isEmpty() && q.peekFirst() == A[i - k])
                q.pollFirst();
        }
        return res;
    }
}
// @lc code=end

