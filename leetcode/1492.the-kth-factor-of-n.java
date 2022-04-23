/*
 * @lc app=leetcode id=1492 lang=java
 *
 * [1492] The kth Factor of n
 */

// @lc code=start
class Solution {
    public int kthFactor(int n, int k) {
        int cnt = 0;
        List<Integer> l = new ArrayList<>();
        for(int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n) l.add(n / i);
                if (++cnt == k) return i;
            }
        }
        if (l.size() + cnt < k) return -1;
        return l.get(l.size() - (k - cnt));
    }
}
// @lc code=end

