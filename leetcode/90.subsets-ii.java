/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {
    List<List<Integer>> res;
    int[] in;
    List<Integer> ar;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        ar = new ArrayList<>();
        in = nums;

        Arrays.sort(in); //output depends

        solve(0);

        return res;
    }

    void solve(int idx) {
        
        res.add(new ArrayList<>(ar));
        for(int i=idx;i<in.length;i++) {
            if(i>idx && in[i] == in[i-1]) continue; //taking on i == idx and skipping others
            // 2 2 2 2 
            //{2}, {2,2}, {2,2,2}, {2,2,2,2}
            ar.add(in[i]);
            solve(i+1);
            ar.remove(ar.size()-1);
        }
    }
}
// @lc code=end

