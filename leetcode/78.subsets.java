/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    
    List<List<Integer>> res;
    int[] in;
    LinkedList<Integer> ar;

    public List<List<Integer>> subsets(int[] nums) {
        res = new LinkedList<>();
        ar = new LinkedList<>();
        in = nums;

        solve(0);

        return res;
    }

    void solve(int idx) {
        
        res.add(new LinkedList<>(ar));
        for(int i=idx;i<in.length;i++) {
            ar.add(in[i]);
            solve(i+1);
            ar.removeLast();
        }
    }

}
// @lc code=end

