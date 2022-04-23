/*
 * @lc app=leetcode id=1642 lang=java
 *
 * [1642] Furthest Building You Can Reach
 */

// @lc code=start
class Solution {
    public int furthestBuilding(int[] A, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < A.length - 1; i++) {
            int d = A[i + 1] - A[i];
            if (d > 0)
                pq.add(d); //Min priority Queue
            if (pq.size() > ladders)
                bricks -= pq.poll();
            if (bricks < 0)
                return i;
        }
        return A.length - 1;
    }
}
// @lc code=end

