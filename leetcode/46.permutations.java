/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {
    List<List<Integer>> res;
    int[] in;
    List<Integer> ar;

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        ar = new ArrayList<>();
        in = nums;
      
        solve();

        return res;
    }

    void solve() {
        if(ar.size() == in.length) {
            res.add(new ArrayList<>(ar));
        }

        for(int i=0;i<in.length;i++) {
            if(ar.contains(in[i])) continue;
            ar.add(in[i]);
            solve();
            ar.remove(ar.size()-1);
        }
    }
}
// @lc code=end

